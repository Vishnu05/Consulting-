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
import com.selfrespect.document.model.ServicesCategory;
import com.selfrespect.document.service.ServicesCategoryService;


@RestController
@RequestMapping(value = "/api/servicescategory")
public class ServicesCategoryController {
	
	final static Logger LOG = LoggerFactory.getLogger(ServicesCategoryController.class);

    @Autowired
    ServicesCategoryService servicescategoryservice;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<ServicesCategory>> findAllServicesCategory(Pageable pageable, HttpServletRequest req) {    	
        Page<ServicesCategory> page = servicescategoryservice.findServicesCategory(pageable); 
        return new ResponseEntity<>(page, HttpStatus.OK); 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ServicesCategory> getServiceCategory(@PathVariable Long id, HttpServletRequest req) {
    	ServicesCategory servicescategory = servicescategoryservice.getServicesCategory(id);
        return new ResponseEntity<>(servicescategory , HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String createServicescategory(@RequestBody ServicesCategory ServicesCategory,  HttpServletRequest req) {
    	//System.out.println("Client create " + Client.toString());
    	//Employee.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
    	servicescategoryservice.saveServicesCategory(ServicesCategory);
        return "{'status:'success'}";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateServiceCategory(@RequestBody ServicesCategory  ServicesCategoryDTO,  HttpServletRequest req) {
    	//EmployeeDTO.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
    	servicescategoryservice.updateServicesCategory(ServicesCategoryDTO);
        return "{'status:'success'}"; 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteServicesCategory(@PathVariable Long id) {
    	servicescategoryservice.deleteDeleteServicesCategory(id);
        return "{'status:'success'}"; 
    }

}
