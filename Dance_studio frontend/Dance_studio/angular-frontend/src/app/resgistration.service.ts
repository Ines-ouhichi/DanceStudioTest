 import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from './client';
import { Cours } from './cours';
import {HttpClient} from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class ResgistrationService {

  constructor(private _http:HttpClient) { }
  DanceDetails = [
    {
      id:1,
      className:"Ballet",
      classDetails:"dans les weekends.",
      classPrice:80,
      classImg:"https://res.cloudinary.com/enicarthage/image/upload/v1650062962/samples/ballet_t1vwtg.jpg"
    },
    {
      id:2,
      className:"Hip Hop",
      classDetails:"3jours par semaine",
      classPrice:70,
      classImg:"https://res.cloudinary.com/enicarthage/image/upload/v1650063173/samples/hiphop_ayj390.jpg"
    },
    {
      id:3,
      className:"tap dancing",
      classDetails:"tous les mercredis",
      classPrice:80,
      classImg:"https://res.cloudinary.com/enicarthage/image/upload/v1650063913/samples/tapdancing1_f1czcg.jpg"
    },
    {
      id:4,
      className:"Dance moderne",
      classDetails:"lundi et jeudi",
      classPrice:60,
      classImg:"https://res.cloudinary.com/enicarthage/image/upload/v1650063820/samples/Two_dancers_zhyhzr.jpg"
    },
    {
      id:5,
      className:"Swig",
      classDetails:"les dimanches matin",
      classPrice:60,
      classImg:"https://res.cloudinary.com/enicarthage/image/upload/v1650064980/samples/swigdance_yjwx7z.jpg"
    },
    {
      id:6,
      className:"Dance de salle",
      classDetails:"les samedi soir",
      classPrice:60,
      classImg:"https://res.cloudinary.com/enicarthage/image/upload/v1650065164/samples/dance_de_salle_sydyte.jpg"
    }
  ]

  videos=[
    {
      id:"PYyWPSKggF0",
      name:'Ballet'
    },
    {
      id:"a0ZytSvcYdc",
      name:'Hip Hop'
    },
    {
      id:"LH_EyxsupRE",
      name:'tap dancing'
    },
    {
      id:"H-QVJpZn8bw",
      name:'Dance Moderne'
    },
    {
      id:"0l-IrUpWEUI",
      name:'Swig'
    },
    {
      id:"u0oggGCS28g",
      name:'Dance de Salle'
    },

    
  ]

  public signUpCltFromRemote(clt:Client):Observable<any>{
     return this._http.post<any>("http://localhost:8080/cltEnregistre",clt)
  }

  public addCours(cours:Cours):Observable<any>{
    return this._http.post<any>("http://localhost:8080/add",cours)
 }
  
  public loginCltFromRemote(clt:Client):Observable<any>{
    return this._http.post<any>("http://localhost:8080/cltlogin",clt)
 }

 public getCours():Observable<Cours[]>{
  return this._http.get<Cours[]>("http://localhost:8080/getAllcours")
 }

 public getCoursByid(id:number):Observable<any>{
  return this._http.get<any>("http://localhost:8080/cours/"+id)
 }

 public deletecours(id: number): Observable<void> {
  return this._http.delete<void>("http://localhost:8080/delete/"+id)
}
}
