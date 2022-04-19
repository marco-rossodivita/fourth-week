import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[ccBackground]',
})
export class CCHoverDirective {
  constructor(private el: ElementRef) {
    this.el.nativeElement.style.backgroundColor = 'yellow';
  }
}
