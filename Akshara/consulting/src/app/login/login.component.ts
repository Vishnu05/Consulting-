import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import {Login} from "./shared/login";
import { LoginService } from './shared/login.service'

//import { BasicValidators } from '../../shared/basic-validators';
import { FormBuilder, FormGroup, Validators, FormArray, FormControl } from '@angular/forms';
import {NgSelectModule} from '@ng-select/ng-select';
import { BrowserModule } from '@angular/platform-browser';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 
   form: FormGroup;
  title: string;
  userID: string;
  passWord: string;
  name:string;
  loading = false;
  error = '';
  logins:boolean;
  searchForm: FormGroup;

  constructor(formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private loginService: LoginService,
    ) {
    this.form = formBuilder.group({

    	
     
    
  userID: ['', [  
      ]],
  passWord: ['', [         
      
      ]],
  
      
              
    });
    
    
    
 }

  ngOnInit() {
    
  }
  
  signIN() {
    
    var result,
        loginValue = this.form.value;
        
        result = this.loginService.login(loginValue);
        result.subscribe(
          
          res => this.router.navigate(['dashboard']),
          err => this.logins = false,
          () => console.log("tried authentication")
        );
        console.log("Hello");
  }

  }

