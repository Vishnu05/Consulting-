package com.selfrespect.document.mvc;
import java.io.IOException;
import java.security.Principal;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.selfrespect.document.model.*;
import com.selfrespect.document.service.*;

@RestController
@RequestMapping(value = "/api/users")
public class LoginController {
	
	final static Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/login_sucess",method=RequestMethod.GET)
    public String createlogin( HttpSession session)
			{
    	    	
    	
    	String username=(String) session.getAttribute("username");
    	String username1 = SecurityContextHolder.getContext().getAuthentication().getName();
    			// Retrieving the role
    			System.out.println("username in login+"+ username);
    			System.out.println("username in login2"+ username1);
    			return "{'status:'success'}";

    }
    
    @RequestMapping(value="/login?error=true")
    public String Failedlogin() {
    	System.out.println("Login Failure");
        return "{'status:'success'}";
    }
	
	
    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String createUser(@RequestBody User user, HttpServletRequest req) {
    	System.out.println("User create " + user.getRol());
    	//Employee.setPhoto((byte[] )req.getSession().getAttribute("photoFile"));
       userService.saveUser(user);
        return "{'status:'success'}";
    }
	
	
	

}



