import { NgModule  } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule }  from '@angular/router';
import { HttpModule }  from '@angular/http';

import{RegistrationComponent} from './registration.component';
import {RegistrationService} from './shared/registration.service'

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    HttpModule,
  ],
  declarations: [
    RegistrationComponent
    
    
  ],

  exports: [
   RegistrationComponent
  ],
  
 providers: [
    
    //PaginationConfig,
    RegistrationService
    
  ]
})
export class RegistrationModule { }
