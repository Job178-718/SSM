package com.sun.service.impl;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import com.sun.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private AccountDao userDao;
	@Autowired
	private Account user;
	public void setUserDao(AccountDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Account select() {
		// TODO Auto-generated method stub
		
		return user;
	}
	

	

}
