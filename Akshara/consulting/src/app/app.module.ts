import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { DateValueAccessorModule } from 'angular-date-value-accessor';
import {NgSelectModule} from '@ng-select/ng-select';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HomeComponent } from './home/home.component';
import { NotFoundComponent } from './not-found/not-found.component';
//Routing
import { routing } from './app.routing';
import { usersRouting } from "./users/users.routing";
import { clientsRouting } from "./clients/clients.routing";
import { ServicescategoryRouting } from "./servicescategory/servicescategory.routing";
import { ServicesRouting } from './services/services.routing';
import { LoginRouting } from "./login/login.routing";
import { DashboardRouting } from "./dashboard/dashboard.routing";
import { AssignRouting} from "./assign/assign.routing"




import { UsersModule } from "./users/users.module";
import { ClientsComponent } from './clients/clients.component';
import { ClientsModule } from './clients/clients.module';
import { ServicescategoryComponent } from './servicescategory/servicescategory.component';
import { ServicescategoryModule } from './servicescategory/servicescategory.module';
import { ServicesComponent } from './services/services.component';
import { ServicesModule } from './services/services.module';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginModule } from './login/login.module';
import {DashboardModule} from './dashboard/dashboard.module'
import { DashboardComponent } from './dashboard/dashboard.component';
import {SidebarComponent} from './dashboard/sidebar/sidebar.component';
import { RegistrationRouting} from './registration/registration.routing';
import { RegistrationModule } from './registration/registration.module';
import { AssignModule } from './assign/assign.module';

import { HttpClientModule } from '@angular/common/http';
import { HttpClientXsrfModule } from '@angular/common/http';




@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    HomeComponent,
    NotFoundComponent,
    
       
  ],
  
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    DateValueAccessorModule,
    HttpClientModule,
    HttpClientXsrfModule, 
        
    UsersModule,
    usersRouting,
    ClientsModule,
    clientsRouting,
    ServicescategoryModule,
    ServicescategoryRouting,
    ServicesModule,
    ServicesRouting,
    LoginModule,
    LoginRouting, 
    DashboardModule,
    DashboardRouting,
    RegistrationModule,      
    RegistrationRouting,
    AssignModule,
    AssignRouting,
    routing,
    NgSelectModule,
    
    
    
    
   
         
   
 ],
  
  providers: [], 
  bootstrap: [AppComponent]
})
export class AppModule { }
