import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'es1';


  hide: boolean = true;
  condition: boolean = true;

  getClass():string{
    return 'x';
  }

  showOrHide() :boolean{
    return this.hide ?  true : false;
  }
}
