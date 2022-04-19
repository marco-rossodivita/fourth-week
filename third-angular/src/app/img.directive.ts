import { Directive, Input, OnChanges, HostBinding } from '@angular/core';
enum TipoLuce {
  ON = 'a.jpg',
  OFF = 'b.jpg',
  EMERGENZA = 'c.jpg',
}

@Directive({
  selector: '[cdOnOff]',
})
export class SpialuceDirective implements OnChanges {
  @HostBinding('src') imageSrc: string | undefined;
  @Input() statoLuce: string | undefined;
  ngOnChanges() {
    this.imageSrc = 'assets/images/' + this.showHideLuce();
  }
  showHideLuce(): TipoLuce {
    if (this.statoLuce == 'ON') {
      return TipoLuce.ON;
    } else if (this.statoLuce == 'OFF') {
      return TipoLuce.OFF;
    }
    return TipoLuce.EMERGENZA;
  }
}
