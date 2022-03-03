package com.hrms.business.abstracts;

import java.util.List;

import com.hrms.core.DataResult;
import com.hrms.core.Result;
import com.hrms.entities.concretes.User;

public interface UserService {
	public DataResult<List<User>> getAll();
	public DataResult<List<User>> getByEmailEquals(String email); 
	public Result add(User user); 
}
