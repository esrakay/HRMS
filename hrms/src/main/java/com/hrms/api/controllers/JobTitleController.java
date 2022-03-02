package com.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.JobTitleService;
import com.hrms.core.DataResult;
import com.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleController {
	
	private JobTitleService jobTitleService; 
	
	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService; 
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return this.jobTitleService.getAll(); 
	}
}
