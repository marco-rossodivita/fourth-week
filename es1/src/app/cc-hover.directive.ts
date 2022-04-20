import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[ccBackground]'
})
export class CcHoverDirective {

  constructor(private el: ElementRef) { 
    el.nativeElement.style.backgroundColor = 'acquamarine';
  }

}
