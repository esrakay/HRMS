package com.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.VerificationCodeCandidateService;

@RestController
@RequestMapping("/api/verificationCodeCandidate")
public class VerificationCodeCandidateController {
	
	private VerificationCodeCandidateService verificationCodeCandidateService;
	
	@Autowired
	public VerificationCodeCandidateController(VerificationCodeCandidateService verificationCodeCandidateService) {
		this.verificationCodeCandidateService = verificationCodeCandidateService;
	}
}
