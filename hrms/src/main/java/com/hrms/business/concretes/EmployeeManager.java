package com.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.EmployeeService;
import com.hrms.core.DataResult;
import com.hrms.core.Result;
import com.hrms.core.SuccessDataResult;
import com.hrms.core.SuccessResult;
import com.hrms.dataAccess.abstracts.EmployeeDao;
import com.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao; 
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao; 
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

	@Override
	public DataResult<List<Employee>> getByFirstName(String firstName) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByFirstName(firstName));
	}

	@Override
	public DataResult<List<Employee>> getByLastName(String lastName) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByLastName(lastName));
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Employee added!");
	}
}
