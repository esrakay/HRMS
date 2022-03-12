package com.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.VerificationCodeCandidateService;
import com.hrms.dataAccess.abstracts.VerificationCodeCandidateDao;

@Service
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService{
	
	private VerificationCodeCandidateDao verificationCodeCandidateDao;
	
	@Autowired
	public VerificationCodeCandidateManager (VerificationCodeCandidateDao verificationCodeCandidateDao) {
		this.verificationCodeCandidateDao = verificationCodeCandidateDao;
	}

}
