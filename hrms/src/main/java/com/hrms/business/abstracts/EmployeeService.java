package com.hrms.business.abstracts;

import java.util.List;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();

	DataResult<List<Employee>> getByFirstName(String firstName);
	DataResult<List<Employee>> getByLastName(String lastName);
	Result add(Employee employee); 
}
