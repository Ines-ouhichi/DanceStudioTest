import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { ResgistrationService } from '../resgistration.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  DanceData:any;
  videoIcon:string ='./assets/img/playButton.png'
  constructor( private _route:Router,private service:ResgistrationService) { }

  ngOnInit(): void {
    this.DanceData = this.service.DanceDetails;
  }
  gotologin(){
    this._route.navigate(['/login'])

  }
  gotosignup(){
    this._route.navigate(['/signup'])

  }
 ;

}
