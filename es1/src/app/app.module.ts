import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { ImgComponent } from './img/img.component';
import { IconsComponent } from './icons/icons.component';
import { ListaComponent } from './lista/lista.component';
import { FormComponent } from './form/form.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material.module';
import { CcHoverDirective } from './cc-hover.directive';
import { UnlessDirective } from './unless.directive';
import { MultiplierPipe } from './multiplier.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    ImgComponent,
    IconsComponent,
    ListaComponent,
    FormComponent,
    CcHoverDirective,
    UnlessDirective,
    MultiplierPipe
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
