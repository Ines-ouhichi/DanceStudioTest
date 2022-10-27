import { Component, OnInit } from '@angular/core';
import { Cours } from '../cours';
import { ResgistrationService } from '../resgistration.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-cours-details',
  templateUrl: './cours-details.component.html',
  styleUrls: ['./cours-details.component.css']
})
export class CoursDetailsComponent implements OnInit {

  id: number;
  cours: Cours;
  constructor(private route: ActivatedRoute,private _service:ResgistrationService, private _route:Router) { }

  ngOnInit(): void {
    this.cours = new Cours();

    this.id = this.route.snapshot.params['id'];
    
    this._service.getCoursByid(this.id)
      .subscribe(data => {
        console.log(data)
        this.cours = data;
      }, error => console.log(error));
  }
  back(){
    this._route.navigate(['dash']);
  }

}
