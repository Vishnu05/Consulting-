import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import {ServicescategoryService} from "./shared/servicescategory.service";
import {Servicescategory} from "./shared/servicescategory";


@Component({
  selector: 'app-servicescategory',
  templateUrl: './servicescategory.component.html',
  styleUrls: ['./servicescategory.component.css']
})
export class ServicescategoryComponent implements OnInit {

public rows:Array<any> = [];
  public columns:Array<any> = [
		 
	 
    {title: 'Services Category Name', name: 'servicecategoryname', filtering: {filterString: '', placeholder: 'Filter by Service Category Name'}},
    {title: ' Service Category Description',  name: 'servicecategorydescription', filtering: {filterString: '', placeholder: 'Filter by  Service Category Description'}},
    
    
  ];
  public page:number = 1;
  public itemsPerPage:number = 10;
  public maxSize:number = 5;
  public numPages:number = 1;
  public length:number = 0;
  
  private data:Array<Servicescategory> = [];


  public constructor(private ServicescategoryService: ServicescategoryService,   private router: Router,
		    private route: ActivatedRoute,) {
    
  }
  



  public ngOnInit():void {
	  this.ServicescategoryService.getServicesCategory()
      .subscribe(
    		  
    	data => {
    	  this.data = data.content;
    	  this.length = this.data.length;
    	
    	
    	//  console.log(data);
    	  this.onChangeTable(this.config, true);
    	 
    	  
    	  
    	},
    	  (error) => console.error(error));
   
  }
  
  public config:any = {
    paging: true,
    idRow : null,
    sorting: {columns: this.columns},
    filtering: {filterString: ''},
    className: ['table-striped', 'table-bordered']
  };

  public editConfig: any = {
    edit: {
      className: 'btn btn-rounded btn-success',
      icon: 'fa fa-pencil-square'
    },
    delete: {
      className: 'btn btn-danger',
      title: 'Delete'
    },
    select: {
      name: 'selection',
      keyProperty: 'name'
    }
  };

 

 

  

  public changePage(page:any, data:Array<any> = this.data):Array<any> {
    let start = (page.page - 1) * page.itemsPerPage;
    let end = page.itemsPerPage > -1 ? (start + page.itemsPerPage) : data.length;
    return data.slice(start, end);
  }

  public changeSort(data:any, config:any):any {
    if (!config.sorting) {
      return data;
    }

    let columns = this.config.sorting.columns || [];
    let columnName:string = void 0;
    let sort:string = void 0;

    for (let i = 0; i < columns.length; i++) {
      if (columns[i].sort !== '' && columns[i].sort !== false) {
        columnName = columns[i].name;
        sort = columns[i].sort;
      }
    }

    if (!columnName) {
      return data;
    }

    // simple sorting
    return data.sort((previous:any, current:any) => {
      if (previous[columnName] > current[columnName]) {
        return sort === 'desc' ? -1 : 1;
      } else if (previous[columnName] < current[columnName]) {
        return sort === 'asc' ? -1 : 1;
      }
      return 0;
    });
  }

  public changeFilter(data:any, config:any):any {
    let filteredData:Array<any> = data;
    this.columns.forEach((column:any) => {
      if (column.filtering) {
        filteredData = filteredData.filter((item:any) => {
        	if(item[column.name])
          return item[column.name].match(column.filtering.filterString);
        });
      }
    });

    if (!config.filtering) {
      return filteredData;
    }

    if (config.filtering.columnName) {
      return filteredData.filter((item:any) =>
        item[config.filtering.columnName].match(this.config.filtering.filterString));
    }

    let tempArray:Array<any> = [];
    filteredData.forEach((item:any) => {
      let flag = false;
      this.columns.forEach((column:any) => {
        if (item[column.name].toString().match(this.config.filtering.filterString)) {
          flag = true;
        }
      });
      if (flag) {
        tempArray.push(item);
      }
    });
    filteredData = tempArray;

    return filteredData;
  }

  public onChangeTable(config:any, page:any = {page: this.page, itemsPerPage: this.itemsPerPage}):any {
    console.log(config);
    if (config.filtering) {
      Object.assign(this.config.filtering, config.filtering);
    }

    if (config.sorting) {
      Object.assign(this.config.sorting, config.sorting);
    }

    let filteredData = this.changeFilter(this.data, this.config);
    let sortedData = this.changeSort(filteredData, this.config);
    this.rows = page && config.paging ? this.changePage(page, sortedData) : sortedData;
    this.length = sortedData.length;
  }

  public onCellClick(data: any): any {
	  console.log(data);
	    if(data.column == 'servicecategoryname'){
	    	 this.router.navigate(['servicescategory/'+ data.row.id])
	    }
  }

  public onEditClick(row: any): any {
    console.log(row);
  }

 
	
  public onDeleteClick(row: any): any {
    console.log("delete clciked");
    
    var removeByAttr = function(arr, attr, value){
	    var i = arr.length;
	    while(i--){
	       if( arr[i] 
	           && arr[i].hasOwnProperty(attr) 
	           && (arguments.length > 2 && arr[i][attr] === value ) ){ 

	           arr.splice(i,1);

	       }
	    }
	    return arr;
	};
	
  
        if (confirm("Are you sure you want to delete " + row.firstName + "?")) {
        

          this.ServicescategoryService.deleteServiceCategory(row.id)
            .subscribe(null,
             null
                
              );
       //   this.data.splice(row.id , 1);
          removeByAttr(this.data, 'id', row.id);
          this.onChangeTable(this.config, true);
        }
        
  }
  

  public onSelectChange(data: any): any {
    console.log(data);
  }

  public onSortChanged(column: any): any {
    console.log(column);
  }

  public onFilterChanged(column: any): any {
    console.log(column);
  }
  
  prepareNewserviceComponent(){
	  this.router.navigate(['servicescategory/new'])
  }

}
