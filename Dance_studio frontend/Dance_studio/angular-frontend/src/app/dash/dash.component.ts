import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cours } from '../cours';
import { ResgistrationService } from '../resgistration.service';

@Component({
  selector: 'app-dash',
  templateUrl: './dash.component.html',
  styleUrls: ['./dash.component.css']
})
export class DashComponent implements OnInit {

  public cours:Cours[]
  public popoverTitle: string = 'Confirmation';
  
  public popoverMessage: string = 'etes vours sur?';
  public confirmClicked: boolean = false;
  public cancelClicked: boolean = false;
  
    


  constructor(private _service:ResgistrationService,private _route:Router) { }

  ngOnInit(): void {
    this.getcours();
  }

  getcours():void{
    this._service.getCours().subscribe(
      (response:Cours[])=>{
        this.cours=response;
        console.log(this.cours);
      },
      ( error:HttpErrorResponse)=>{
        alert(error.message);
      }
    );
  }


  deletecours(id: number) {
    this._service.deletecours(id).subscribe(
        (reponse:void) => {
          console.log(reponse);
          this.getcours();
        },
        ( error:HttpErrorResponse)=>{
          alert(error.message);
        }
    );
}
coursDetails(id: number){
  this._route.navigate(['details', id]);
}




}