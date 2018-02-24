import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import { URLSearchParams } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import { Router, ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import {Login} from "./login";

@Injectable()
export class LoginService {

private url: string = "http://localhost:8081/Documentprocess";

constructor(private http: Http,private router: Router,
  private route: ActivatedRoute) { }

 login(user) {
  let params = new URLSearchParams();
   params.set('username', user.userID);
   params.set('password', user.passWord);
    var headers = new Headers();
    headers.append('Content-Type', 'application/x-www-form-urlencoded');
    let options = new RequestOptions({ headers: headers });

  console.log(user);
  
  console.log(this.url+'/login');
  return this.http.post(this.url+'/login', params,options)
 
 }
 
 
   
}