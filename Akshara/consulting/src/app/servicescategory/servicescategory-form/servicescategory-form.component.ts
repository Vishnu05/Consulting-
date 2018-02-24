import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import {ServicescategoryService} from "../shared/servicescategory.service";
import {Servicescategory} from "../shared/servicescategory";
import { BasicValidators } from '../../shared/basic-validators';

@Component({
  selector: 'app-servicescategory-form',
  templateUrl: './servicescategory-form.component.html',
  styleUrls: ['./servicescategory-form.component.css']
})
export class ServicescategoryFormComponent implements OnInit {

private url: string = "http://localhost:8081/Documentprocess/api/servicescategory";
  form: FormGroup;
  title: string;
  servicecategory: Servicescategory = new Servicescategory();
 
  fileChange(event) {
	  let fileList: FileList = event.target.files;
  	  this.servicescategoryService.uploadFiles(fileList);
  }
	


  constructor(
    formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private servicescategoryService: ServicescategoryService
  ) {
	  
	
    this.form = formBuilder.group({
    	
      id:[],	
      servicecategoryname: ['', [
        Validators.required
        
      ]],
      servicecategorydescription: ['', [
        Validators.required
     
      ]],
      
    });
  }

  ngOnInit() {
    var id = this.route.params.subscribe(params => {
      var id = params['id'];

      this.title = id ? 'Edit servicecategory' : 'New servicecategory';

      if (!id)
        return;

      this.servicescategoryService.getServiceCategory(id)
        .subscribe(
          servicecategory => this.servicecategory = servicecategory,
          response => {
            if (response.status == 404) {
              this.router.navigate(['NotFound']);
            }
          });
    });
  }

  save() {
    var result,
        ServicescategoryValue = this.form.value;

    if (ServicescategoryValue.id){
      result = this.servicescategoryService.updateServiceCategory(ServicescategoryValue);
    } else {
      result = this.servicescategoryService.addServiceCategory(ServicescategoryValue);
    }

    result.subscribe(data => this.router.navigate(['servicescategory']));
    
  }
}
