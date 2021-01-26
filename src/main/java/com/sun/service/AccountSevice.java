package com.sun.service;

import com.sun.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountSevice {
    /**
     * 查询所有
     */
    List<Account> findAll();

    /**
     *保存
     */
    int save(Account account);

    /**
     * 注册账号
     */
    int register(Account account);

    /**
     *
     * @param account
     * @return
     */
    boolean login(Account account);

}
