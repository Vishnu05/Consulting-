import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {BrowserModule} from '@angular/platform-browser'
import { Router, ActivatedRoute } from '@angular/router';
import { BasicValidators } from '../shared/basic-validators';
import { Registration } from './shared/registration';
import { RegistrationService} from './shared/registration.service'

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  
  form: FormGroup;
  title: string;
  registration: Registration = new Registration();
  roles = ["Role_Admin","Role_Employee","Role_Client"];

  constructor(formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private registrationService: RegistrationService,
    
  ) { 

    this.form = formBuilder.group({
    
    
    
      id:[],	

       firstName: ['', [
         
         
       ]],

       lastName: ['', [
             
       ]],
       email: ['', [
         
      
       ]],

       userID: ['', [
       
     
      ]],
      
      passWord: ['', [
        
     
      ]],


       role: ['', [
         
      
       ]],

       rol: ['', [
         
      
      ]],
       
             
       
      
     });
  }

  ngOnInit() {

    
  }

  save() {
    var result,
        registrationValue = this.form.value;
      console.log(registrationValue.role);
    
      result = this.registrationService.addRegistartion(registrationValue);
    

    result.subscribe(data => this.router.navigate(['dashboard']));
    
  }

}
