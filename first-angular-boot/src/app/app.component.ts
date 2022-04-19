import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface IUser {
  name: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'first-angular-boot';

  users: any[] = [];

  constructor(private httpClient: HttpClient) {
    this.httpClient
      .get<any>('http://localhost:8080/api/v1/all')
      .subscribe((e) => {
        console.log(e);
        this.users = e;
      });
  }
}
