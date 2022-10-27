import { Component, OnInit } from '@angular/core';
import { Cours } from '../cours';
import { ResgistrationService } from '../resgistration.service';

@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.css']
})
export class CatalogComponent implements OnInit {
  DanceData:any;
  
  constructor(private service:ResgistrationService) { }

  ngOnInit(): void {
    this.DanceData = this.service.DanceDetails;
  }
  save() {}

}
