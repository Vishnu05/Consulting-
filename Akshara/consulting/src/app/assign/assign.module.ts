import { NgModule  } from '@angular/core';
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
import { FileUpload } from 'ng2-fileupload';
import {NgSelectModule} from '@ng-select/ng-select';
import { BrowserModule } from '@angular/platform-browser';
import { AssignComponent } from './assign.component';
import { AssignService} from './shared/assign.service';
import { AssignFormComponent } from './assign-form/assign-form.component'

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
    NgSelectModule,
    BrowserModule ,
  ],
  declarations: [AssignComponent, AssignFormComponent],
  exports: [AssignComponent],
  providers: [AssignService]
})
export class AssignModule { }
