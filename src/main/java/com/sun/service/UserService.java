package com.sun.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.sun.domain.Account;

@Service
public interface UserService {
	/**
	 * 查找数据
	 */
	public Account select();
	/**
	 * 
	 */
}
