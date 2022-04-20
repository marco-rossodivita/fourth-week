import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-money',
  templateUrl: './money.component.html',
  styleUrls: ['./money.component.css']
})
export class MoneyComponent implements OnInit {

  export class MoneyComponent implements OnInit, OnDestroy {

    @Input() baseCurrencies: Currencies;
  
    @Input() otherCurrencies: Currencies;
  
    @Output()
    updateExchangeRates: EventEmitter<ConversionRate> =
      new EventEmitter<ConversionRate>();
  
    @Output()
    errorMessage: EventEmitter<string> = new EventEmitter<string>();
  
    baseCurrencyCodes: string[];
    currentCurrencyCode: string;
    currentCurrencyCodeSubject: BehaviorSubject<string>;
    otherCurrencyCodes: string[];
  
    @ViewChild(NgModel) moneyInputModel: NgModel;
  
    currencyPattern = new RegExp(`\[,\]`, 'g');
  
    valueSubject = new Subject<number>();
  
    observableSubscription: Subscription;
  
    constructor(private conversionRatesService: ConversionRatesService) { }
  
    ngOnInit() {
      this.baseCurrencyCodes = Object.keys(this.baseCurrencies);
      this.currentCurrencyCode = this.baseCurrencyCodes[0];
      this.currentCurrencyCodeSubject = new BehaviorSubject<string>(this.currentCurrencyCode);
      this.otherCurrencyCodes = Object.keys(this.otherCurrencies);
  
      const valuesObs = this.valueSubject.pipe(
        filter(value => value > 0 && !isNaN(value) && isFinite(value)),
        debounceTime(800),
        distinctUntilChanged()
      );
  
      const combinedDataObs = combineLatest(
        valuesObs,
        this.currentCurrencyCodeSubject
      );
  
      this.observableSubscription = combinedDataObs
        .pipe(
          distinctUntilChanged((arr1, arr2) => {
            return arr1[0] === arr2[0] && arr1[1] === arr2[1];
          }),
          switchMap(
            (dataArray) => this.conversionRatesService.getLatestExchangeRates(
              dataArray[0],
              dataArray[1],
              this.otherCurrencyCodes.filter(item => item !== this.currentCurrencyCode)
            )
          )
        ).subscribe(
          (value) => {
            this.updateExchangeRates.emit(value);
            this.conversionRatesService.stopLoading();
          },
          (error) => {
            this.conversionRatesService.stopLoading();
            this.errorMessage.emit(error.message);
          }
        );
    }
  
    onCurrencySelection(newCurrencyCode: string) {
      this.currentCurrencyCode = newCurrencyCode;
      this.currentCurrencyCodeSubject.next(this.currentCurrencyCode);
    }
  
    onInput(value: string) {
      const newValue = value.replace(this.currencyPattern, '');
      if (this.moneyInputModel.valid) {
        this.valueSubject.next(Number(newValue));
      }
    }
  
    ngOnDestroy() {
      this.observableSubscription.unsubscribe();
    }
  }

}
