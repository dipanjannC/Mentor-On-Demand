import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListUserComponent } from './user/list-user/list-user.component';
import { LoginComponent } from './shared/login/login.component';
import { SignUpComponent } from './shared/sign-up/sign-up.component';
import { AdminSidebarComponent } from './admin/admin-sidebar/admin-sidebar.component';
import { HomeComponent } from './shared/home/home.component';
import { FindMentorComponent } from './shared/find-mentor/find-mentor.component';
import { BeMentorComponent } from './shared/be-mentor/be-mentor.component';


const routes: Routes = [
  { path : '', redirectTo:'home',pathMatch:'full'},
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'list-user', component: ListUserComponent },
  { path : 'register', component : SignUpComponent},
  { path : 'find-mentor', component : FindMentorComponent},
  { path : 'be-mentor', component : BeMentorComponent},
  { path : 'admin-home', component : AdminSidebarComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
