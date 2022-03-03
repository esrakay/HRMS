package com.hrms.business.abstracts;

import java.util.List;

import com.hrms.core.DataResult;
import com.hrms.core.Result;
import com.hrms.entities.concretes.Candidate;

public interface CandidateService {
	public DataResult<List<Candidate>> getAll();
	public DataResult<List<Candidate>> getAll(int pageNo, int pageSize);
	public Result add(Candidate candidate);
}
