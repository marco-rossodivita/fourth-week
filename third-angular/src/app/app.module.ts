import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CCHoverDirective } from './cc-hover.directive';
import { UnlessDirective } from './unless.directive';
import { MultiplierPipe } from './multiplier.pipe';

@NgModule({
  declarations: [AppComponent, CCHoverDirective, UnlessDirective, MultiplierPipe],
  imports: [BrowserModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
