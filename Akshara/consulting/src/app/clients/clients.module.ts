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

import { ClientsComponent } from './clients.component';
import { ClientFormComponent } from './client-form/client-form.component';
import { ClientsService } from './shared/clients.service';

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
  declarations: [ClientFormComponent,ClientsComponent],
  exports: [
    ClientsComponent
  ],
  providers: [ClientsService,PaginationConfig]
})
export class ClientsModule { }
