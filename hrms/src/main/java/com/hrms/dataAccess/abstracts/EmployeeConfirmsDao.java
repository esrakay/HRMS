package com.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entities.concretes.EmployeeConfirms;

public interface EmployeeConfirmsDao extends JpaRepository<EmployeeConfirms, Integer>{

}
