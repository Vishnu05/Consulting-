package com.selfrespect.document.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.selfrespect.document.model.Services;
import com.selfrespect.document.repository.ServicesRepository;

@Service
@Transactional
public class ServicesService {
	
	final static Logger LOG = LoggerFactory.getLogger(Services.class);

    @Autowired
    ServicesRepository servicesRepository;

   

   
    public Page<Services> findServices(Pageable pageable) { 
        return servicesRepository.findAll(pageable);
    }

    
    public Services getService(Long id) {
        return  servicesRepository.getOne(id);
        
    }

    
    public void updateServices(Services services) {
      //  Employee Employee = EmployeeRepository.findOne(Employee.getId());
    	servicesRepository.save(services);
    }

   
    public void saveService(Services services) {
    
    	servicesRepository.save(services);
    }

    
    public void deleteService(Long id) {
    	servicesRepository.delete(id);
    }

}
