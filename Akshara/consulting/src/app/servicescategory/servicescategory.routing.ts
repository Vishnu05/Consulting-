import { Routes, RouterModule } from '@angular/router';

import { ServicescategoryComponent } from './servicescategory.component';
import { ServicescategoryFormComponent } from "./servicescategory-form/servicescategory-form.component";

const ServicescategoryRoutes: Routes = [
  { path: 'servicescategory', component: ServicescategoryComponent, pathMatch: 'full' },
  { path: 'servicescategory/new', component: ServicescategoryFormComponent},
  { path: 'servicescategory/:id', component: ServicescategoryFormComponent}
];

export const ServicescategoryRouting = RouterModule.forChild(ServicescategoryRoutes);
