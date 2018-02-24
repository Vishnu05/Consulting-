import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';

import { Employee } from '../shared/user';
import { UsersService } from '../shared/users.service';
import { BasicValidators } from '../../shared/basic-validators';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  private url: string = "http://localhost:8081/Documentprocess/api/employee";
  form: FormGroup;
  title: string;
  employee: Employee = new Employee();
 
  fileChange(event) {
	  let fileList: FileList = event.target.files;
  	  this.usersService.uploadFiles(fileList);
  }
	


  constructor(
    formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private usersService: UsersService
  ) {
	  
	
    this.form = formBuilder.group({
    	
      id:[],	
      firstName: ['', [
        Validators.required        
      ]],
      lastName: ['', [
        Validators.required     
      ]],
      email: ['', [
        Validators.required,
        BasicValidators.email
        //Validators.pattern("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")
      ]],
      mobileNo: [null, [ Validators.required]],
      otherContactNo: [],
      aadharNo: ['', [
        Validators.required
      
      ]],
      panNo:['', [
        Validators.required
      
      ]],
      photo: [],
      dob: [null, [
        Validators.required
      
      ]],
      
     address:  [],
    });
  }

  ngOnInit() {
    var id = this.route.params.subscribe(params => {
      var id = params['id'];

      this.title = id ? 'Edit employee' : 'New employee';

      if (!id)
        return;

      this.usersService.getUser(id)
        .subscribe(
          employee => this.employee = employee,
          response => {
            if (response.status == 404) {
              this.router.navigate(['NotFound']);
            }
          });
    });
  }

  save() {
    var result,
        userValue = this.form.value;

    if (userValue.id){
      result = this.usersService.updateUser(userValue);
    } else {
      result = this.usersService.addUser(userValue);
    }

    result.subscribe(data => this.router.navigate(['users']));
    
  }
}
