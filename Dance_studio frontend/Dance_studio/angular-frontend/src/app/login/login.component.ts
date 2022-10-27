import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ResgistrationService } from '../resgistration.service';
import { Client } from '../client';
import { Route, Router } from '@angular/router';
import { NgToastService } from 'ng-angular-popup';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  clt = new Client();
   msg='';
  constructor(private _service:ResgistrationService, private _route:Router,private toast:NgToastService) { }


 

  ngOnInit(): void {
  }

  loginClt(){
    this._service.loginCltFromRemote(this.clt).subscribe(
      data =>{
         console.log("reponse recue");
         this._route.navigate(['/catalog']);
         this.toast.success({detail:'Success',summary:'connexion etablite', sticky:true,position:'tr',duration:5000})
        },
      error => {
        console.log("exception declanchée");
        this.msg="information erronée"
        this.toast.error({detail:'error',summary:'informations eronées,Veuillez verifier vos informations',sticky:true,position:'tr',duration:5000})
      }
    )
  }
  gotocatalog(){
    this._route.navigate(['/catalog'])

  }
}
