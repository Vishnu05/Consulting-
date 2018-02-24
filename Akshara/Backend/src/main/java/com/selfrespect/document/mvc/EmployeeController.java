package com.selfrespect.document.mvc;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.selfrespect.document.model.Employee;
import com.selfrespect.document.service.EmployeeService;


@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    final static Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<Employee>> findAllEmployee(Pageable pageable, HttpServletRequest req) {    	
        Page<Employee> page = employeeService.findEmployees(pageable); 
        return new ResponseEntity<>(page, HttpStatus.OK); 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id, HttpServletRequest req) {
    	Employee Employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(Employee, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String createEmployee(@RequestBody Employee Employee,  HttpServletRequest req) {
    	System.out.println("Employee create " + Employee.toString());
    	Employee.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
        employeeService.saveEmployee(Employee); 
        return "{'status:'success'}";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateEmployee(@RequestBody Employee EmployeeDTO,  HttpServletRequest req) {
    	EmployeeDTO.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
        employeeService.updateEmployee(EmployeeDTO);
        return "{'status:'success'}"; 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "{'status:'success'}"; 
    }
}


