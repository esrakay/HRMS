package com.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.EmployeeConfirmsService;

@RestController
@RequestMapping("/api/employeeConfirms")
public class EmployeeConfirmsController {
	
	private EmployeeConfirmsService employeeConfirmsService;
	
	@Autowired
	public EmployeeConfirmsController(EmployeeConfirmsService employeeConfirmsService) {
		this.employeeConfirmsService = employeeConfirmsService;
	}
}
