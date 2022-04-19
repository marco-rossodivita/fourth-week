import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'custom-angular-directive';
  condition = true;
  hide: boolean = true;

  str: string = 'ciao';

  books: string[] = ['a', 'b', 'c', 'd', 'e', 'f'];

  getClass(): string {
    return 'first';
  }

  showOrHide(): boolean {
    return false;
  }
}
