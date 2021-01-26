package com.sun.dao;

import com.sun.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AccountDao {

    /**
     * 查询
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(name,money) values(#{name},#{money})")
    public Integer save(Account account);

    @Insert("insert into account(user,password) values(#{user},#{password})")
    public Integer register(Account account);

    @Select("select * from account where user=#{user} and password=#{password}")
    public Boolean login(Account account);


}
