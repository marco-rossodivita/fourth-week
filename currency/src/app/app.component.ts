import { Currencies } from './model/currencies.model';
import { Subscription } from 'rxjs';
import { Component, OnInit, OnDestroy } from '@angular/core';

import { ConversionRate } from './model/conversion-rate.model';
import { ConversionRatesService } from './conversion-rates.service';
import { CurrencyListService } from './currency-list.service';

@Component({
  selector: 'simple-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, OnDestroy {


  constructor() { }

  ngOnInit() {
    
  }

}