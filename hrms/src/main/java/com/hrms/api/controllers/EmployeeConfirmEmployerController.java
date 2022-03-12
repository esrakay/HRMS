package com.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.EmployeeConfirmEmployerService;

@RestController
@RequestMapping("/api/employeeConfirmEmployer")
public class EmployeeConfirmEmployerController {
	
	private EmployeeConfirmEmployerService employeeConfirmEmployerService;
	
	@Autowired
	public EmployeeConfirmEmployerController(EmployeeConfirmEmployerService employeeConfirmEmployerService) {
		this.employeeConfirmEmployerService = employeeConfirmEmployerService;
	}
}
