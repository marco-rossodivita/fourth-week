import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { ELEMENT_DATA, PeriodicElement } from '../interface/model';

@Component({
  selector: 'app-table-data',
  templateUrl: './table-data.component.html',
  styleUrls: ['./table-data.component.css'],
})
export class TableDataComponent implements OnInit {
  displayedColumns: string[] = ['position', 'name', 'weight', 'symbol'];
  dataSource = [...ELEMENT_DATA];

  @ViewChild(MatTable) table: MatTable<PeriodicElement> | undefined;
  constructor() {}

  ngOnInit(): void {}

  addData() {
    const randomElementIndex = Math.floor(Math.random() * ELEMENT_DATA.length);
    this.dataSource.push(ELEMENT_DATA[randomElementIndex]);
    this.table?.renderRows();
  }

  removeData() {
    this.dataSource.pop();
    this.table?.renderRows();
  }

  print() {
    console.log('Hello from Table');
  }
}
