import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListUserComponent } from './user/list-user/list-user.component';
import { LoginComponent } from './shared/login/login.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'list-user', component: ListUserComponent },
  { path : '', component : LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
