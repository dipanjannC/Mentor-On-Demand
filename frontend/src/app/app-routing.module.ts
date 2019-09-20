import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListUserComponent } from './user/list-user/list-user.component';
import { LoginComponent } from './shared/login/login.component';
import { SignUpComponent } from './shared/sign-up/sign-up.component';
import { AdminSidebarComponent } from './admin/admin-sidebar/admin-sidebar.component';


const routes: Routes = [
  { path : '', component : LoginComponent},
  { path: 'login', component: LoginComponent },
  { path: 'list-user', component: ListUserComponent },
  { path : 'register', component : SignUpComponent},
  { path : 'admin-home', component : AdminSidebarComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
