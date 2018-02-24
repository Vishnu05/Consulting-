import { Routes, RouterModule } from '@angular/router';

import { ServicesComponent } from './services.component';
import {ServicesFormComponent} from "./services-form/services-form.component";

const servicesRoutes: Routes = [
  { path: 'services', component: ServicesComponent, pathMatch: 'full' },
  { path: 'services/new', component: ServicesFormComponent},
  { path: 'services/:id', component: ServicesFormComponent}
];

export const ServicesRouting = RouterModule.forChild(servicesRoutes);
