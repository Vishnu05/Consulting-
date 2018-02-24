import { Component, OnInit } from '@angular/core';
import {AssignService} from "./shared/assign.service";


import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-assign',
  templateUrl: './assign.component.html',
  styleUrls: ['./assign.component.css']
})
export class AssignComponent implements OnInit {

  constructor(private assignService: AssignService,private router: Router,
    private route: ActivatedRoute,) { }

  ngOnInit() {
  }
  newassign(){
	  this.router.navigate(['assign/new'])
  }
}
