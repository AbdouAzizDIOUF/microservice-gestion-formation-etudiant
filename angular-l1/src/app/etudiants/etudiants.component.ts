import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-etudiants',
  templateUrl: './etudiants.component.html',
  styleUrls: ['./etudiants.component.css']
})
export class EtudiantsComponent implements OnInit {


  listFormations:any;
  listEetudiants:any;

  currentFormation={id:-1};

  constructor(private httpClient:HttpClient) { }

  ngOnInit() {
      this.httpClient.get("http://localhost:8001/formations")
        .subscribe(data => {
            this.listFormations=data;
        },error => {
          console.log(error)
        });
   }

  onGetEtudiants(f){
    this.currentFormation=f;
    this.httpClient.get("http://localhost:8001/formations/"+f.id+"/etudiants")
      .subscribe(data=>{
        this.listEetudiants=data;
      },error => {
        console.log(error)
      });
  }

}
