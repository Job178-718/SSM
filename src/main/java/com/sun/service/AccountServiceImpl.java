package com.sun.service;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountSevice{

    @Autowired
    private AccountDao accountdao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Account> findAll() {
        //System.out.println("业务层：.....");
        return accountdao.findAll();
    }

    @Override
    public int save(Account account) {
        return accountdao.save(account);
    }

    @Override
    public int register(Account account){
        return accountdao.register(account);
    }

    @Override
    public boolean login(Account account){
        return accountdao.login(account);
    }

}
