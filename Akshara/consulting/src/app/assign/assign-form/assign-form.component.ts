import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {BrowserModule} from '@angular/platform-browser'
import { Router, ActivatedRoute } from '@angular/router';


import { BasicValidators } from '../../shared/basic-validators';

import {Employee} from "../../users/shared/user";
import {UsersService} from "../../users/shared/users.service";

import {Client} from "../../clients/shared/client";
import {ClientsService} from "../../clients/shared/clients.service";



import { Services } from '../../services/shared/services';
import { ServicesService } from '../../services/shared/services.service';




@Component({
  selector: 'app-assign-form',
  templateUrl: './assign-form.component.html',
  styleUrls: ['./assign-form.component.css']
})
export class AssignFormComponent implements OnInit {

  form: FormGroup;
  title: string;
  
 services:  Services;
 employees: Employee;
 clients: Client;

  constructor(formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private servicesService: ServicesService,
    private usersService: UsersService,private clientsService: ClientsService,) {
      this.form = formBuilder.group({
    
    
    
        
         
               
         
        
       });
     }

  ngOnInit() {

    this.usersService.getUsers().subscribe(
          		  
    	data => {
        this.employees = data.content;
           	  
    	},
        (error) => console.error(error));
        
        this.clientsService.getClients().subscribe(
          		  
          data => {
            this.clients = data.content;
                   
          },
            (error) => console.error(error));

      this.servicesService.getServices().subscribe(
          		  
              data => {
                this.services = data.content;
                       
              },
                (error) => console.error(error));

    
  }

}
