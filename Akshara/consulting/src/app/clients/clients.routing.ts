import { Routes, RouterModule } from '@angular/router';

import { ClientsComponent } from './clients.component';
import {ClientFormComponent} from "./client-form/client-form.component";



const clientsRoutes: Routes = [
  { path: 'clients', component: ClientsComponent, pathMatch: 'full' },
  { path: 'clients/new', component: ClientFormComponent},
  { path: 'clients/:id', component: ClientFormComponent}
 
];

export const clientsRouting = RouterModule.forChild(clientsRoutes);
