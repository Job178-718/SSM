package com.sun.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 账户类
 * 注册，登录
 *
 */
@Component
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
    private String user;
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
