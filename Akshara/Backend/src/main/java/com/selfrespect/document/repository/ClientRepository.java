package com.selfrespect.document.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.selfrespect.document.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>, ClientRepositoryCustom {

}
