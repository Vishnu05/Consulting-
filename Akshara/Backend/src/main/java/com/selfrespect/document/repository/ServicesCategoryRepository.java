package com.selfrespect.document.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.selfrespect.document.model.ServicesCategory;

public interface ServicesCategoryRepository extends JpaRepository<ServicesCategory, Long>, ServicesCategoryRepositoryCustom {

}
