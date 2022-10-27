import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { FormsModule } from '@angular/forms';
import { SignupCbComponent } from './signup-cb/signup-cb.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './sharepage/navbar/navbar.component';
import { FooterComponent } from './sharepage/footer/footer.component';
import { CatalogComponent } from './catalog/catalog.component';
import { DashComponent } from './dash/dash.component';
import { FormcoursComponent } from './formcours/formcours.component';
import { CoursDetailsComponent } from './cours-details/cours-details.component';
import { NgToastModule } from 'ng-angular-popup';
import { NgxYoutubePlayerModule } from 'ngx-youtube-player';
import { ConfirmationPopoverModule } from 'angular-confirmation-popover';
import { ContactComponent } from './contact/contact.component';
import { Video1Component } from './video1/video1.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignUpComponent,
    SignupCbComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent,
    CatalogComponent,
    DashComponent,
    FormcoursComponent,
    CoursDetailsComponent,
    ContactComponent,
    Video1Component,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    NgToastModule,
    AppRoutingModule,
    ConfirmationPopoverModule.forRoot(
      {
        confirmButtonType:'danger'
      }
    ),
    NgxYoutubePlayerModule.forRoot(),
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
