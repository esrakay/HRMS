package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	List<Employee> getByFirstName(String firstName);
	List<Employee> getByLastName(String lastName); 
}
