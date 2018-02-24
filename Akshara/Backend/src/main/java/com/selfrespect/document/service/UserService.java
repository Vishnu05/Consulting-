package com.selfrespect.document.service;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selfrespect.document.model.*;
import com.selfrespect.document.repository.*;


@Service
@Transactional
public class UserService {
	
	final static Logger LOG = LoggerFactory.getLogger(User.class);

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    RoleRepository rolerepository;

   

   
   

    
    public User getUser(String userid) {
       return  userRepository.getOne(userid);
        
    }

    
    public void updateUser(User user) {
      
    	userRepository.save(user);
    }

   
    public void saveUser(User user) {
    	Set<Role> role = user.getRoles();
    	Role userRole = rolerepository.findByRole(user.getRol());
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
    
    	userRepository.save(user);
    }

    
    public void deleteUser(String email) {
    	userRepository.delete(email);
    }

}
