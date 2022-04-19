import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-course-java',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'First Angular Project';

  isHide: boolean = false;

  ngOnInit(): void {
    setTimeout(() => {
      this.isHide = true;
    }, 5000);
  }
}
