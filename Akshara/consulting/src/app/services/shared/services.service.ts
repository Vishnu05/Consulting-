import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';
import {Services} from "./services";
import {Servicescategory} from "../../servicescategory/shared/servicescategory";



@Injectable()
export class ServicesService {

private url: string = "http://localhost:8081/Documentprocess/api/services";




  constructor(private http: Http) { }
 
   
getServicesCategory(){
    return this.http.get(this.url)
      //.map(res => <Servicescategory[]>res.json()).catch(this.handleError);
  }
  getServices(){
    return this.http.get(this.url)
      .map(res => <Services[]>res.json()).catch(this.handleError);
  }

  handleError(error: Response){
	  console.error(error);
	  return Observable.throw(error);
	  
  }
  getService(id){
    return this.http.get(this.getServiceUrl(id))
      .map(res => res.json());
  }

  addService(service){
   console.log(service);
   console.log(this.url);
    return this.http.post(this.url, service);
      //.map(res => res.json());     
  }

  updateService(service){
    return this.http.put(this.getServiceUrl(service.id), service);
    //  .map(res => res.json());
  }

  deleteService(id){
    return this.http.delete(this.getServiceUrl(id));
     // .map(res => res.json());
  }

  private getServiceUrl(id){
    return this.url + "/" + id;
  }

}
