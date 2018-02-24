import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';
import {Servicescategory} from "./servicescategory";

@Injectable()
export class ServicescategoryService {

private url: string = "http://localhost:8081/Documentprocess/api/servicescategory";
private fileUploadUrl: string = "http://localhost:8081/Documentprocess/api/upload";

  constructor(private http: Http) { }
  
  uploadFiles(fileList: FileList) {
	  
	  if(fileList.length > 0) {
	      let file: File = fileList[0];
	      let formData:FormData = new FormData();
	      formData.append('file', file, file.name);
	        this.http.post(`${this.fileUploadUrl}`, formData)
	           .catch(error => Observable.throw(error))
	          .subscribe( 
	              data => console.log('file upload success'),	
	              error => {this.handleError(error), alert("Error in uploading the attachment");}
	         )
	  }
  }

  getServicesCategory(){
  console.log("getServicesCategory called");
    return this.http.get(this.url)      
      .map(res => 
      <Servicescategory[]>res.json()
      ).catch(this.handleError);
      
  }

  handleError(error: Response){
  console.log("error n sevice ateg");
	  console.error(error);
	  return Observable.throw(error);
	  
  }
  getServiceCategory(id){
    return this.http.get(this.getServicesCategoryUrl(id))
      .map(res => res.json());
  }

  addServiceCategory(servicescategory){
    return this.http.post(this.url, servicescategory);
      //.map(res => res.json());     
  }

  updateServiceCategory(servicescategory){
    return this.http.put(this.getServicesCategoryUrl(servicescategory.id),servicescategory);
    //  .map(res => res.json());
  }

  deleteServiceCategory(id){
    return this.http.delete(this.getServicesCategoryUrl(id));
     // .map(res => res.json());
  }

  private getServicesCategoryUrl(id){
    return this.url + "/" + id;
  }

}
