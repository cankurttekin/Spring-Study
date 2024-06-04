package com.cankurttekin.aopdemo.dao;

import com.cankurttekin.aopdemo.Account;

import java.util.List;

public interface AccountDAO {
    List<Account> findAccounts();
    void addAccount(Account theAccount, boolean vipFlag);
    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);

}