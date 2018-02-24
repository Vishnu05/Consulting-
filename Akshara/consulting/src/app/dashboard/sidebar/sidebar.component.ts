import { Component, OnInit } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import * as $ from 'jquery';

declare const $: any;
declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
  { path: 'dashboard', title: 'Dashboard',  icon: 'pe-7s-graph', class: '' },
    { path: 'users', title: 'Employee Operations',  icon:'pe-7s-user', class: '' },
    { path: 'clients', title: 'Client Operations',  icon:'pe-7s-note2', class: '' },
    { path: 'servicescategory', title: 'ServicesCategory Operations',  icon:'pe-7s-news-paper', class: '' },
    { path: 'services', title: 'Services Operations',  icon:'pe-7s-science', class: '' },
    { path: 'user/new', title: 'User Sign Up',  icon:'pe-7s-add-user', class: '' },
    { path: 'assign', title: 'Assign a Client to a Employee',  icon:'pe-7s-users', class: '' },
    { path: 'threads', title: 'View Threads',  icon:'pe-7s-users', class: '' },
    { path: 'upgrade', title: 'View Threads',  icon:'pe-7s-rocket', class: 'active-pro' },
];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html'
})
export class SidebarComponent implements OnInit {
  menuItems: any[];

  constructor() { }

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
  }
  isMobileMenu() {
      //if ($(window).width() > 991) {
       //return false;
      //}
      return false;
  };
}
