import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MoneyComponent } from './money/money.component';
import { CurrencySelectorComponent } from './currency-selector/currency-selector.component';
import { CurrencyListComponent } from './currency-list/currency-list.component';
import { CurrencyListItemComponent } from './currency-list-item/currency-list-item.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';

import { MaterialModule } from './material.module';

@NgModule({
  declarations: [
    AppComponent,
    MoneyComponent,
    CurrencySelectorComponent,
    CurrencyListComponent,
    CurrencyListItemComponent
  ],
  imports: [
    BrowserModule,
    NoopAnimationsModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
