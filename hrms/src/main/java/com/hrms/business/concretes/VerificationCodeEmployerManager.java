package com.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.VerificationCodeEmployerService;
import com.hrms.dataAccess.abstracts.VerificationCodeEmployerDao;

@Service
public class VerificationCodeEmployerManager implements VerificationCodeEmployerService{
	
	private VerificationCodeEmployerDao verificationCodeEmployerDao;
	
	@Autowired
	public VerificationCodeEmployerManager(VerificationCodeEmployerDao verificationCodeEmployerDao) {
		this.verificationCodeEmployerDao = verificationCodeEmployerDao; 
	}
}
