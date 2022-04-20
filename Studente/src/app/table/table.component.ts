import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {


  students: any[] = [];
  displayedColumns: string[] = ['position', 'name', 'weight', 'symbol'];
  

  constructor(private httpClient: HttpClient){
    this.httpClient.get<any>('http://localhost:8080/student/v1/get')
    .subscribe((e)=>{
      console.log(e);
      this.students = e;
    
    
    })
    //dataSource = students;
  }

  

  ngOnInit(): void {
  }

}
