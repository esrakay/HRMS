package com.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.JobTitleService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.core.utilities.results.SuccessResult;
import com.hrms.dataAccess.abstracts.JobTitleDao;
import com.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao; 
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao; 
	}
	
	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll()); 
	}

	@Override
	public DataResult<List<JobTitle>> getByTitleStartsWith(String title) {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.getByTitleStartsWith(title));
	}

	@Override
	public DataResult<List<JobTitle>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<JobTitle>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "title");
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(sort), "successful");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Job title added!");
	}
}
