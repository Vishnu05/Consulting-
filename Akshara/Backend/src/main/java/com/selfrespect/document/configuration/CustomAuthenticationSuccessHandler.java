
/**
package com.selfrespect.document.configuration;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	
	
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
        //set our response to OK status
        //response.setStatus(HttpServletResponse.SC_OK);
        
        boolean admin = false;

        HttpSession session = request.getSession(true);


        
       

        
       //logger.info("AT onAuthenticationSuccess(...) function!");
        
  /**      for (GrantedAuthority auth : authentication.getAuthorities()) {
            if ("Role_Admin".equals(auth.getAuthority())){
            	admin = true;
            	String username = SecurityContextHolder.getContext().getAuthentication().getName();
            	System.out.println("username in authetication"+username);
            	session.setAttribute("username", username);
            	System.out.println(session.getAttribute("username"));
            	session.setAttribute("Role", auth.getAuthority());
            	
            }
        }
        
        if(admin){
        	response.sendRedirect("api/users/login_sucess");
        	
        }else{
        	response.sendRedirect("api/users/login_sucess");
        }
	}

	}  
        
} */
