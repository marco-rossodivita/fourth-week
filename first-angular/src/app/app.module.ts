import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { BrowserModule } from '@angular/platform-browser';
import { SpinnerComponent } from './spinner/spinner.component';
import { MaterialModule } from './material.module';
import { MaterialToolbarComponent } from './material-toolbar/material-toolbar.component';
import { TableDataComponent } from './table-data/table-data.component';

@NgModule({
  declarations: [AppComponent, SpinnerComponent, MaterialToolbarComponent, TableDataComponent],
  imports: [BrowserModule, MaterialModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
