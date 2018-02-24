import { Routes, RouterModule } from '@angular/router';

import { LoginComponent } from './login.component';

const loginRoutes: Routes = [
  { path: 'login', component: LoginComponent, pathMatch: 'full' },
  //{ path: 'services/new', component: ServicesFormComponent},
  //{ path: 'services/:id', component: ServicesFormComponent}
];

export const LoginRouting = RouterModule.forChild(loginRoutes);
