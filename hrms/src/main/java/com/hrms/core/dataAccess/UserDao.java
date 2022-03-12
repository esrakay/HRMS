package com.hrms.core.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	List<User> getByEmailEquals(String email); 
}
