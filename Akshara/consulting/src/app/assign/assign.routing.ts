import { Routes, RouterModule } from '@angular/router';

import { AssignComponent } from './assign.component';
import {AssignFormComponent} from "./assign-form/assign-form.component";



const assignRoutes: Routes = [
  { path: 'assign', component: AssignComponent , pathMatch: 'full' },
  { path: 'assign/new', component: AssignFormComponent},
  //{ path: 'clients/:id', component: ClientFormComponent}
 
];

export const AssignRouting = RouterModule.forChild(assignRoutes);