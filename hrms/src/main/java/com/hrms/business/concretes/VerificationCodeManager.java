package com.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.VerificationCodeService;
import com.hrms.dataAccess.abstracts.VerificationCodeDao;

@Service
public class VerificationCodeManager implements VerificationCodeService{
	
	private VerificationCodeDao verificationCodeDao; 
	
	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		this.verificationCodeDao = verificationCodeDao; 
	}
}
