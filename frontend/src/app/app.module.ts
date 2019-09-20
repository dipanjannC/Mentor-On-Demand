import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignUpComponent } from './shared/sign-up/sign-up.component';

import { ListUserComponent } from './user/list-user/list-user.component';
import { LoginComponent } from './shared/login/login.component';

import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AuthenticationService } from './services/auth.service';
import { UserService } from './services/user.service';
import { IndexNavbarComponent } from './shared/index-navbar/index-navbar.component';
import { UserHomeComponent } from './user/user-home/user-home.component';
import { AdminHomeComponent } from './admin/admin-home/admin-home.component';
import { HomeNavbarComponent } from './shared/home-navbar/home-navbar.component';
import { AdminSidebarComponent } from './admin/admin-sidebar/admin-sidebar.component';



@NgModule({
  declarations: [
    AppComponent,
    SignUpComponent,
    LoginComponent,
    ListUserComponent,
    IndexNavbarComponent,
    UserHomeComponent,
    AdminHomeComponent,
    HomeNavbarComponent,
    AdminSidebarComponent,

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
