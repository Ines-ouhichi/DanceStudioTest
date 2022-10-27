import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ResgistrationService } from '../resgistration.service';
import { Client } from '../client';
import { Route, Router } from '@angular/router';
import { NgToastService } from 'ng-angular-popup';


@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

   clt = new Client();
   msg='';
  constructor(private _service:ResgistrationService, private _route:Router,private toast:NgToastService) { }

  ngOnInit(): void {
  }
  SignUpClt(){
    this._service.signUpCltFromRemote(this.clt).subscribe(
      data =>{
         console.log("reponse recue");
         this._route.navigate(['/signup']);
         this.msg="Registration etablit";
         this.toast.success({detail:'Success',summary:'Inscription etablite', sticky:true,position:'tr',duration:5000})

        },
      error => {
        console.log("exception declanchée");
        this.msg="email deja existant,veuillez changer votre mail"
        this.toast.error({detail:'error',summary:'email deja existant,veuillez changer votre mail',sticky:true,position:'tr',duration:5000})
      }
    )
  }

  afficher(){
    console.log(Object.values(this.clt));
  }
  gotologin(){
    this._route.navigate(['/login'])

  }
}
