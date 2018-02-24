import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {BrowserModule} from '@angular/platform-browser'
import { Router, ActivatedRoute } from '@angular/router';
import { Services } from '../shared/services';
import { ServicesService } from '../shared/services.service';
import { BasicValidators } from '../../shared/basic-validators';
import {ServicescategoryService} from "../../servicescategory/shared/servicescategory.service";
import {Servicescategory} from "../../servicescategory/shared/servicescategory";



@Component({
  selector: 'app-services-form',
  templateUrl: './services-form.component.html',
  styleUrls: ['./services-form.component.css']
})
export class ServicesFormComponent implements OnInit {

private url: string = "http://localhost:8081/Documentprocess/api/services";
  form: FormGroup;
  title: string;
  service: Services = new Services();
 categories:  Servicescategory;
 //categories = ["A","B"];
  
  
  

   constructor(
    formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private servicesService: ServicesService,
    private ServicescategoryService: ServicescategoryService
  ) {
	  
	
    this.form = formBuilder.group({
    
    
    
     id:[],	
      serviceName: ['', [
        Validators.required
        
      ]],
      serviceCategory: ['', [
        
     
      ]],
      sdate: ['', [
        Validators.required
     
      ]],
      serviceDescription: ['', [
        Validators.required
     
      ]],
      
            
      
     
    });
  }

  ngOnInit() {
  
      var id = this.route.params.subscribe(params => {
      var id = params['id'];
      
      
     this.ServicescategoryService.getServicesCategory().subscribe(
      
    		  
    	data => {
        this.categories = data.content;
           	  
    	},
    	  (error) => console.error(error));


     
     
      this.title = id ? 'Edit service' : 'New service';

      if (!id)
        return;

      this.servicesService.getService(id)
        .subscribe(
          service => this.service = service,
          response => {
            if (response.status == 404) {
              this.router.navigate(['NotFound']);
            }
          });
    });
  }

  save() {
    var result,
        serviceValue = this.form.value;
      console.log(serviceValue+"Here");
    if (serviceValue.id){
      result = this.servicesService.updateService(serviceValue);
    } else {
      result = this.servicesService.addService(serviceValue);
    }

    result.subscribe(data => this.router.navigate(['services']));
    
  }
  
}
