import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ThisReceiver } from '@angular/compiler';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})



export class AppComponent {
  title = 'Spring';

  students: any[] = [];
  

  constructor(private httpClient: HttpClient){
    this.httpClient.get<any>('http://localhost:8080/student/v1/get')
    .subscribe((e)=>{
      console.log(e);
      this.students = e;
    
    })
  }

  public getStudents() : any[]{
    return this.students;
  }

}






