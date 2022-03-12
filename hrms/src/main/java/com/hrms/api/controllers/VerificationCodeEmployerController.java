package com.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.VerificationCodeEmployerService;

@RestController
@RequestMapping("/api/verificationCodeEmployer")
public class VerificationCodeEmployerController {
	
	private VerificationCodeEmployerService verificationCodeEmployerService;
	
	@Autowired
	public VerificationCodeEmployerController(VerificationCodeEmployerService verificationCodeEmployerService) {
		this.verificationCodeEmployerService = verificationCodeEmployerService; 
	}
}
