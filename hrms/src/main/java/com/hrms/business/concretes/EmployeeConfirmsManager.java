package com.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.EmployeeConfirmsService;
import com.hrms.dataAccess.abstracts.EmployeeConfirmsDao;

@Service
public class EmployeeConfirmsManager implements EmployeeConfirmsService{
	
	private EmployeeConfirmsDao employeeConfirmsDao;
	
	@Autowired
	public EmployeeConfirmsManager(EmployeeConfirmsDao employeeConfirmsDao) {
		this.employeeConfirmsDao = employeeConfirmsDao;
	}
}
