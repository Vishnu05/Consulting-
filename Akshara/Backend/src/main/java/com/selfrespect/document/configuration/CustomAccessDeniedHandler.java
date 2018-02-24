/*package com.selfrespect.document.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;
import org.springframework.security.web.csrf.MissingCsrfTokenException;
import org.springframework.stereotype.Component;

@Component
public class CustomAccessDeniedHandler extends AccessDeniedHandlerImpl {
	
	@Override
    public void handle(HttpServletRequest request,
            HttpServletResponse response,

  AccessDeniedException accessDeniedException)
    throws IOException, ServletException {
if (accessDeniedException instanceof MissingCsrfTokenException
        || accessDeniedException instanceof InvalidCsrfTokenException) {

    if(request.getRequestURI().contains("login")){
    	System.out.println(request.getContextPath());
        response.sendRedirect(request.getContextPath()+"/login");                                        
    }
}

super.handle(request, response, accessDeniedException);



 }

}
*/
