package com.hrms.business.abstracts;

import java.util.List;

import com.hrms.core.DataResult;
import com.hrms.core.Result;
import com.hrms.entities.concretes.Employer;

public interface EmployerService {
	public DataResult<List<Employer>> getAll();
	public DataResult<List<Employer>> getAllSorted();
	public DataResult<List<Employer>> getAll(int pageNo, int pageSize);
	public DataResult<Employer> getByCompanyName(String companyName); 
	public DataResult<List<Employer>> getByCompanyNameStartsWith(String companyName); 
	public Result add(Employer employer);
	
}
