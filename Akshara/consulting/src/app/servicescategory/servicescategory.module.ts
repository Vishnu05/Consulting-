import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule }  from '@angular/router';
import { HttpModule }  from '@angular/http';

//import { Ng2TableModule } from 'ng2-table/ng2-table';
import { Ng2TableModule } from 'lluchmk-ng2-table';
import { PaginationModule } from 'ng2-bootstrap/ng2-bootstrap'; 
import { TabsModule } from 'ng2-bootstrap/ng2-bootstrap';
import { PaginationConfig } from 'ng2-bootstrap/ng2-bootstrap';
import { NgDatepickerModule } from 'ng2-datepicker';


import { ServicescategoryComponent } from './servicescategory.component';
import { ServicescategoryFormComponent } from './servicescategory-form/servicescategory-form.component';
import { ServicescategoryService } from './shared/servicescategory.service';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    HttpModule,
    NgDatepickerModule,
    PaginationModule,
    Ng2TableModule,
    TabsModule,
  ],
  declarations: [ServicescategoryComponent, ServicescategoryFormComponent,
    ],
        
    exports: [
    ServicescategoryComponent
  ],  
  providers: [    
    PaginationConfig, ServicescategoryService
    
  ]
})
export class ServicescategoryModule { }
