import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cours } from '../cours';
import { ResgistrationService } from '../resgistration.service';

@Component({
  selector: 'app-formcours',
  templateUrl: './formcours.component.html',
  styleUrls: ['./formcours.component.css']
})
export class FormcoursComponent implements OnInit {
cours=new Cours()
  constructor(private _service:ResgistrationService, private _route:Router) { }

  ngOnInit(): void {
  }
save(){
  this._service.addCours(this.cours).subscribe(
    data =>{
      console.log("reponse recue");
      this._route.navigate(['/dash'])
     },
   error => {
     console.log("exception declanchée");
    
   }
  )
}
}
