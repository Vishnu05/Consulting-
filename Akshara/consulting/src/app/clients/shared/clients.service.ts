import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import {Observable} from 'rxjs/Rx';
import {Client} from "./client";

@Injectable()
export class ClientsService {

  private url: string = "http://localhost:8081/Documentprocess/api/client";
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

  getClients(){
    return this.http.get(this.url)
      .map(res => <Client[]>res.json()).catch(this.handleError);
  }

  handleError(error: Response){
	  console.error(error);
	  return Observable.throw(error);
	  
  }
  getClient(id){
    return this.http.get(this.getClientUrl(id))
      .map(res => res.json());
      
  }

  addClient(client){
    return this.http.post(this.url, client);
      //.map(res => res.json());     
  }

  updateClient(client){
    return this.http.put(this.getClientUrl(client.id), client);
    //  .map(res => res.json());
  }

  deleteClient(id){
    return this.http.delete(this.getClientUrl(id));
     // .map(res => res.json());
  }

  private getClientUrl(id){
    return this.url + "/" + id;
  }

}
