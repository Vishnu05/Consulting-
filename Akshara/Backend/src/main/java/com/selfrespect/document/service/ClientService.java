package com.selfrespect.document.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selfrespect.document.model.Client;
import com.selfrespect.document.model.Employee;
import com.selfrespect.document.repository.ClientRepository;



@Service
@Transactional
public class ClientService {
	
	final static Logger LOG = LoggerFactory.getLogger(Client.class);
	
	@Autowired
    ClientRepository clientRepository;
	
	public Page<Client> findclients(Pageable pageable) { 
        return clientRepository.findAll(pageable);
    }

    
    public Client getclient(Long id) {
        return  clientRepository.getOne(id);
        
    }

    
    public void updateclient(Client client) {
      //  Employee Employee = EmployeeRepository.findOne(Employee.getId());
    	clientRepository.save(client);
    }

   
    public void saveClient(Client client) {
    
    	clientRepository.save(client);
    }

    
    public void deleteEmployee(Long id) {
    	clientRepository.delete(id);
    }

}
