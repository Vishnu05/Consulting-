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
import com.selfrespect.document.model.Services;
import com.selfrespect.document.service.ServicesService;

@RestController
@RequestMapping(value = "/api/services")
public class ServicesController {
	
	final static Logger LOG = LoggerFactory.getLogger(ServicesController.class);

    @Autowired
    ServicesService servicesService;
    
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<Services>> findAllServices(Pageable pageable, HttpServletRequest req) {    	
        Page<Services> page = servicesService.findServices(pageable);
        return new ResponseEntity<>(page, HttpStatus.OK); 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Services> getService(@PathVariable Long id, HttpServletRequest req) {
    	Services service = servicesService.getService(id);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String createservice(@RequestBody Services service ,  HttpServletRequest req) {
    	System.out.println("Service create " + service.getSdate());
    	servicesService.saveService(service);
        return "{'status:'success'}";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateService(@RequestBody Services ServicesDTO,  HttpServletRequest req) {
    	//EmployeeDTO.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
        servicesService.updateServices(ServicesDTO);
        return "{'status:'success'}"; 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteService(@PathVariable Long id) {
    	servicesService.deleteService(id);
        return "{'status:'success'}"; 
    }

    
}
