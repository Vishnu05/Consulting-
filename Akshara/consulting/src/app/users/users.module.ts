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


import { UsersComponent } from './users.component';
import { UsersService } from './shared/users.service';
import { UserFormComponent } from './user-form/user-form.component';
import { FileUpload } from 'ng2-fileupload'

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
   // FileUpload
  ],
  declarations: [
    UsersComponent,
    UserFormComponent
  ],
 
  exports: [
    UsersComponent
  ],
  providers: [
    UsersService,
    PaginationConfig
    
  ]
})
export class UsersModule { }
