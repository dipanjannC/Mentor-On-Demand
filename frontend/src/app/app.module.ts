import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignUpComponent } from './shared/sign-up/sign-up.component';
import { NavbarComponent } from './user/navbar/navbar.component';
import { HomeComponent } from './user/home/home.component';
import { ListUserComponent } from './user/list-user/list-user.component';
import { LoginComponent } from './shared/login/login.component';

import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AuthenticationService } from './services/auth.service';
import { UserService } from './services/user.service';



@NgModule({
  declarations: [
    AppComponent,
    SignUpComponent,
    NavbarComponent,
    HomeComponent,
    LoginComponent,
    ListUserComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [AuthenticationService, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
