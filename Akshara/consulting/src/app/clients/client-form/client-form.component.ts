import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormArray, FormControl } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import {NgSelectModule} from '@ng-select/ng-select';
import { BrowserModule } from '@angular/platform-browser';


import { Client } from '../shared/client';
import { ClientsService } from '../shared/clients.service';
import { BasicValidators } from '../../shared/basic-validators';


@Component({
  selector: 'app-client-form',
  templateUrl: './client-form.component.html',
  styleUrls: ['./client-form.component.css']
})
export class ClientFormComponent implements OnInit {

 private url: string = "http://localhost:8081/Documentprocess/api/client";
  form: FormGroup;
  title: string;
  client: Client = new Client();
  name:string;
  searchForm: FormGroup;
  exists = false;
  exists4 = false;
  exists5 = false;
  
  toggleExists() {
    this.exists = !this.exists;
  }
  
  toggleExists4() {
    this.exists4 = !this.exists4;
  }
  
  toggleExists5() {
    this.exists5 = !this.exists5;
  }
 
  fileChange(event) {
	  let fileList: FileList = event.target.files;
  	  this.clientsService.uploadFiles(fileList);
  }
types = [
     "Select","Proprietor","Partnership","Private Limited","Public Limited","One Person Company"
  ];
  
  update(type){
   
     console.log(type);
  } 
 

  constructor(
    formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private clientsService: ClientsService,
    ) {
	 this.form = formBuilder.group({

    	
      id: [],
    
  typeofClient: ['', [  
      ]],
  ccDate: ['', [         
      
      ]],
  companyName: ['', [        
      
      ]],
  registrationName: ['', [        
      
      ]],
  registrationNumber: ['', [         
      
      ]],
  rnumberDocument : ['', [         
      
      ]],
  gstNumber: ['', [         
      
      ]],
  gstnumberDocument:['', [         
      
      ]],
  rDate: ['', [        
      
      ]],
  rentalAgrement: ['', [        
      
      ]],
  co1Name: ['', [        
      
      ]],
  co2Name: ['', [        
      
      ]],
  co3Name: ['', [         
      
      ]],
  co4Name: ['', [         
      
      ]],
  co5Name: ['', [         
      
      ]], 
  co1Dob: ['', [         
      
      ]], 
  co2Dob: ['', [         
      
      ]], 
  co3Dob: ['', [         
      
      ]], 
  co4Dob: ['', [         
      
      ]], 
  co5Dob: ['', [         
      
      ]],
  pan1Number: ['', [         
      
      ]],
  pan2Number: ['', [         
      
      ]],
  pan3Number: ['', [         
      
      ]],
  pan4Number: ['', [         
      
      ]],
  pan5Number: ['', [         
      
      ]],
  pan1Doc: ['', [         
      
      ]],
  pan2Doc: ['', [         
      
      ]],
  pan3Doc: ['', [         
      
      ]],
  pan4Doc: ['', [         
      
      ]],
  pan5Doc: ['', [
         
      
      ]],
  aadharNumber1: ['', [        
      
      ]],
  aadharNumber2: ['', [         
      
      ]],
  aadharNumber3: ['', [         
      
      ]],
  aadharNumber4: ['', [         
      
      ]],
  aadharNumber5: ['', [         
      
      ]],
  aadharNumber1Doc: ['', [         
      
      ]],
  aadharNumber2Doc: ['', [         
      
      ]],
  aadharNumber3Doc: ['', [         
      
      ]],
  aadharNumber4Doc: ['', [         
      
      ]],
  aadharNumber5Doc: ['', [         
      
      ]],
  contactNumber1: ['', [         
      
      ]],
  contactNumber2: ['', [         
      
      ]],
  contactNumber3: ['', [         
      
      ]],
  contactNumber4: ['', [         
      
      ]],
  contactNumber5: ['', [         
      
      ]],
  contactEmail1: ['', [         
      
      ]],
  contactEmail2: ['', [         
      
      ]],
  contactEmail3: ['', [         
      
      ]],
  contactEmail4: ['', [         
      
      ]],
  contactEmail5: ['', [         
      
      ]],
  registeredAddress: ['', [         
      
      ]],
  communictionAddress: ['', [         
      
      ]],
  bankName: ['', [         
      
      ]],
  bankbranchName: ['', [         
      
      ]],
  accountNumber: ['', [         
      
      ]],
  ifscNumber: ['', [         
      
      ]],
  partnershipdeedDoc: ['', [         
      
      ]],
  incorporationcertificateDoc: ['', [         
      
      ]],
  moaDoc: ['', [         
      
      ]],
  aoaDoc: ['', [         
      
      ]],
  directorName: ['', [         
      
      ]],
  directoridNumber: ['', [         
      
      ]],
  directorfatherName: ['', [         
      
      ]],
  directorspancardNumber: ['', [         
      
      ]],
  directorsaadharNumber: ['', [         
      
      ]],
  directorspresentAddress: ['', [         
      
      ]],
  directorspermanentAddress: ['', [         
      
      ]],
  dateofAppointment: ['', [         
      
      ]],
       
              
    });
    
  }
  

  
   
  

  ngOnInit() {
    var id = this.route.params.subscribe(params => {
      var id = params['id'];
            
      this.title = id ? 'Edit client' : 'New client';

      if (!id)
        return;

      this.clientsService.getClient(id)
        .subscribe(
          client => this.client = client,
          response => {
            if (response.status == 404) {
              this.router.navigate(['NotFound']);
            }
          });
    });
    
       
  }
 
 
  



  save() {
    var result,
        clientValue = this.form.value;

    if (clientValue.id){
      result = this.clientsService.updateClient(clientValue);
    } else {
       console.log(clientValue);
      result = this.clientsService.addClient(clientValue);
    }

    result.subscribe(data => this.router.navigate(['clients']));
    
  }

}
