package com.selfrespect.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selfrespect.document.model.*;

public interface UserRepository extends JpaRepository<User, String>, UserRepositoryCustom{
	
	 

}
