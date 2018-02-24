package com.selfrespect.document.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selfrespect.document.model.Employee;
import com.selfrespect.document.repository.EmployeeRepository;




@Service
@Transactional
public class EmployeeService  {

    final static Logger LOG = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    EmployeeRepository employeeRepository;

   

   
    public Page<Employee> findEmployees(Pageable pageable) { 
        return employeeRepository.findAll(pageable);
    }

    
    public Employee getEmployee(Long id) {
        return  employeeRepository.getOne(id);
        
    }

    
    public void updateEmployee(Employee Employee) {
      //  Employee Employee = EmployeeRepository.findOne(Employee.getId());
    	employeeRepository.save(Employee);
    }

   
    public void saveEmployee(Employee Employee) {
    
    	employeeRepository.save(Employee);
    }

    
    public void deleteEmployee(Long id) {
    	employeeRepository.delete(id);
    }
}
