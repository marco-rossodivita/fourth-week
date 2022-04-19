import { Component, OnInit, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-material-toolbar',
  templateUrl: './material-toolbar.component.html',
  styleUrls: ['./material-toolbar.component.css'],
})
export class MaterialToolbarComponent {
  setClasses() {
    const obj = {
      red: 'red',
    };
    return obj;
  }

  getInlineStyles() {
    let styles = {
      color: 'green',
      'text-decoration': 'none',
    };
    return styles;
  }
}
