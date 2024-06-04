package com.cankurttekin.aopdemo.dao;

import com.cankurttekin.aopdemo.Account;

public interface AccountDAO {
    void addAccount(Account theAccount, boolean vipFlag);
    boolean doWork();
}
