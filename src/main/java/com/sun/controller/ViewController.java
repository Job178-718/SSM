package com.sun.controller;

import com.sun.domain.Account;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import com.sun.service.AccountServiceImpl;
import com.sun.service.AccountSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class ViewController{
    @Autowired
    private  AccountSevice accountSevice;

    @RequestMapping("/find.do")
    public ModelAndView findAll(){
        List<Account> list = accountSevice.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sucess");
        return mv;
    }

    @RequestMapping("/save.do")
    public String save(Account account){
            int save = accountSevice.save(account);
        return "sucess";
    }

    @RequestMapping("/register.do")
    public String register(Account account){
        accountSevice.register(account);
        return "sucess";
    }

    @RequestMapping("/login.do")
    public String login(Account account){
        accountSevice.login(account);
        return "index";
    }


}
