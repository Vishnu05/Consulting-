import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';
import {Registration} from "./registration";


@Injectable()
export class RegistrationService {

  private url: string = "http://localhost:8081/Documentprocess/api/users";

  constructor(private http: Http) { }


  addRegistartion(Registration){
    console.log(Registration);
    //console.log(Role);
    console.log(this.url);
     return this.http.post(this.url, Registration);
       //.map(res => res.json());     
   }

}
