package com.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.JobTitleService;
import com.hrms.core.DataResult;
import com.hrms.core.Result;
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
	
	@GetMapping("/getByTitle")
	public DataResult<List<JobTitle>> getByTitleStartsWith(@RequestParam String title){
		return this.jobTitleService.getByTitleStartsWith(title);
	}
	
	@GetMapping("getAllByPage")
	public DataResult<List<JobTitle>> getAll(int pageNo, int pageSize){
		return this.jobTitleService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobTitle>> getAllSorted(){
		return this.jobTitleService.getAllSorted();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
}
