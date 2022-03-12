package com.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.VerificationCodeService;

@RestController
@RequestMapping("/api/verificationCode")
public class VerificationCodeController {
	
	private VerificationCodeService verificationCodeService;
	
	@Autowired
	public VerificationCodeController(VerificationCodeService verificationCodeService) {
		this.verificationCodeService = verificationCodeService;
	}
}
