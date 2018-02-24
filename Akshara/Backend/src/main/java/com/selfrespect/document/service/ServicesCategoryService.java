package com.selfrespect.document.service;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selfrespect.document.model.Employee;
import com.selfrespect.document.model.ServicesCategory;
import com.selfrespect.document.repository.EmployeeRepository;
import com.selfrespect.document.repository.ServicesCategoryRepository;


@Service
@Transactional
public class ServicesCategoryService {

	final static Logger LOG = LoggerFactory.getLogger(ServicesCategoryService.class);

    @Autowired
    ServicesCategoryRepository servicescategoryRepository;

   

   
    public Page<ServicesCategory> findServicesCategory(Pageable pageable) { 
    	  return servicescategoryRepository.findAll(pageable);
    }

    
    public ServicesCategory getServicesCategory(Long id) {
        return  servicescategoryRepository.getOne(id);
        
    }

    
    public void updateServicesCategory(ServicesCategory ServicesCategory) {
      //  Employee Employee = EmployeeRepository.findOne(Employee.getId());
    	servicescategoryRepository.save(ServicesCategory);
    }

   
    public void saveServicesCategory(ServicesCategory ServicesCategory) {
    
    	servicescategoryRepository.save(ServicesCategory);
    }

    
    public void deleteDeleteServicesCategory(Long id) {
    	servicescategoryRepository.delete(id);
    }
}
