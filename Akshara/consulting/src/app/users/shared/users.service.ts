import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';
import {Employee} from "./user";

@Injectable()
export class UsersService {

private url: string = "http://localhost:8081/Documentprocess/api/employee";
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

  getUsers(){
    return this.http.get(this.url)
      .map(res => <Employee[]>res.json()).catch(this.handleError);
  }

  handleError(error: Response){
	  console.error(error);
	  return Observable.throw(error);
	  
  }
  getUser(id){
    return this.http.get(this.getUserUrl(id))
      .map(res => res.json());
  }

  addUser(user){
    return this.http.post(this.url, user);
      //.map(res => res.json());     
  }

  updateUser(user){
    return this.http.put(this.getUserUrl(user.id), user);
    //  .map(res => res.json());
  }

  deleteUser(id){
    return this.http.delete(this.getUserUrl(id));
     // .map(res => res.json());
  }

  private getUserUrl(id){
    return this.url + "/" + id;
  }
}
