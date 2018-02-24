package com.selfrespect.document.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.selfrespect.document.model.Services;

public interface ServicesRepository extends JpaRepository<Services, Long>, ServicesRepositoryCustom {

}
