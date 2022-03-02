package com.hrms.business.abstracts;

import java.util.List;

import com.hrms.core.DataResult;
import com.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	public DataResult<List<JobTitle>> getAll(); 
}
