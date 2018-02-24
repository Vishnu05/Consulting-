import { Routes, RouterModule } from '@angular/router';

import { RegistrationComponent } from './registration.component';




const registrationRoutes: Routes = [
  //{ path: 'clients', component: ClientsComponent, pathMatch: 'full' },
  { path: 'user/new', component: RegistrationComponent},
   
];

export const RegistrationRouting = RouterModule.forChild(registrationRoutes);