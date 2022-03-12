package com.hrms.business.abstracts;

import java.util.List;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	public DataResult<List<JobTitle>> getAll(); 
	public DataResult<List<JobTitle>> getAll(int pageNo, int pageSize);
	public DataResult<List<JobTitle>> getAllSorted();
	public DataResult<List<JobTitle>> getByTitleStartsWith(String title);
	public Result add(JobTitle jobTitle);
}
