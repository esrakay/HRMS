package com.hrms.business.concretes;

import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.EmployeeConfirmEmployerService;
import com.hrms.dataAccess.abstracts.EmployeeConfirmEmployerDao;

@Service
public class EmployeeConfirmEmployerManager implements EmployeeConfirmEmployerService{
	
	private EmployeeConfirmEmployerDao employeeConfirmEmployerDao;
	
	public EmployeeConfirmEmployerManager(EmployeeConfirmEmployerDao employeeConfirmEmployerDao) {
		this.employeeConfirmEmployerDao = employeeConfirmEmployerDao; 
	}
}
