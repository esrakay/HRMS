package com.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.core.utilities.results.SuccessResult;
import com.hrms.dataAccess.abstracts.EmployerDao;
import com.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao; 
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao; 
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public DataResult<List<Employer>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "companyName"); 
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(sort));
	}

	@Override
	public DataResult<List<Employer>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<Employer> getByCompanyName(String companyName) {
		return new SuccessDataResult<Employer>(this.employerDao.getByCompanyName(companyName));
	}

	@Override
	public DataResult<List<Employer>> getByCompanyNameStartsWith(String companyName) {
		return new SuccessDataResult<List<Employer>>(this.employerDao.getByCompanyNameStartsWith(companyName));
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer added!");
	}

}
