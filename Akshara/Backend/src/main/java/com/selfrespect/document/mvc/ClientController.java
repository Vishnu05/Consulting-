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
import com.selfrespect.document.model.Client;
import com.selfrespect.document.service.ClientService;


@RestController
@RequestMapping(value = "/api/client")
public class ClientController {
	
	final static Logger LOG = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<Client>> findAllClients(Pageable pageable, HttpServletRequest req) {    	
        Page<Client> page = clientService.findclients(pageable); 
        return new ResponseEntity<>(page, HttpStatus.OK); 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> getClient(@PathVariable Long id, HttpServletRequest req) {
    	Client client = clientService.getclient(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String createClient(@RequestBody Client Client,  HttpServletRequest req) {
    	System.out.println("Client create " + Client.toString());
    	//Employee.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
    	clientService.saveClient(Client);
        return "{'status:'success'}";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateClient(@RequestBody Client ClientDTO,  HttpServletRequest req) {
    	//EmployeeDTO.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
        clientService.updateclient(ClientDTO);
        return "{'status:'success'}"; 
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteEmployee(id);
        return "{'status:'success'}"; 
    }

}
