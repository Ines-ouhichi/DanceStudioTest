import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CatalogComponent } from './catalog/catalog.component';
import { ContactComponent } from './contact/contact.component';
import { CoursDetailsComponent } from './cours-details/cours-details.component';
import { DashComponent } from './dash/dash.component';
import { FormcoursComponent } from './formcours/formcours.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { SignupCbComponent } from './signup-cb/signup-cb.component';
import { Video1Component } from './video1/video1.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'signupCb',component:SignupCbComponent},
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignUpComponent},
  {path:'catalog',component:CatalogComponent},
  {path:'cours',component:FormcoursComponent},
  {path:'dash',component:DashComponent},
  {path:'details/:id',component:CoursDetailsComponent},
  {path:'contact',component:ContactComponent},
  {path:'v1',component:Video1Component}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
