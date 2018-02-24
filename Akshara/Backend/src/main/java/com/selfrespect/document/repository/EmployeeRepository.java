package com.selfrespect.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selfrespect.document.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, EmployeeRepositoryCustom {

}
