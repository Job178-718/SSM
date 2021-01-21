package com.sun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.sun.domain.Account;
import com.sun.service.UserService;

@Component
public interface AccountDao {
	
	/**
	 * 增
	 * 
	 */
	Integer add(@Param("id")Integer id,@Param("user")String user,@Param("password")String password);
	
	/**
	 * 删
	 */
	Integer delete(@Param("id")Integer id);
	
	
	/**
	 * 改
	 */
	Integer update(@Param("id")Integer id,@Param("password")String password);
	
	
	
	/**
	 * 查
	 */
	Account query(@Param("id") Integer id);
	
	
	/**
	 * 通过Account查找数据得到id值
	 */
	List<Integer> getId(Account account);
	
	

}
