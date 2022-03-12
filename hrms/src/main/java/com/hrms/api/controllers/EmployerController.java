package com.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Employer>> getAllSorted(){
		return this.employerService.getAllSorted();
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Employer>> getAll(int pageNo, int pageSize){
		return this.employerService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getByCompanyName")
	public DataResult<Employer> getByCompanyName(@RequestParam String companyName){
		return this.employerService.getByCompanyName(companyName);
	}
	
	@GetMapping("/getByCompanyNameStartsWith")
	public DataResult<List<Employer>> getByCompanyNameStartsWith(@RequestParam String companyName){
		return this.employerService.getByCompanyNameStartsWith(companyName);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
}
