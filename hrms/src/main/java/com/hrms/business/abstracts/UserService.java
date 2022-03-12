package com.hrms.business.abstracts;

import java.util.List;

import com.hrms.core.entities.User;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;

public interface UserService {
	public DataResult<List<User>> getAll();
	public DataResult<List<User>> getByEmailEquals(String email); 
	public Result add(User user); 
}
