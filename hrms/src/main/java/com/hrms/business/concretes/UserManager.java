package com.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.business.abstracts.UserService;
import com.hrms.core.dataAccess.UserDao;
import com.hrms.core.entities.User;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao; 
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao; 
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public DataResult<List<User>> getByEmailEquals(String email) {
		return new SuccessDataResult<List<User>>(this.userDao.getByEmailEquals(email));
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User added!");
	}

	
}
