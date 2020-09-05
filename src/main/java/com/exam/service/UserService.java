package com.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.IUsersDao;


@Service
public class UserService implements IUserService {

	@Autowired
	IUsersDao userDao;
	
	


}
