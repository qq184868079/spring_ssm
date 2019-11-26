package com.qingfeng.service;

import com.qingfeng.domain.Account;



import java.util.List;

public interface AccountService {

    //添加账户
    public void save(Account account);


    //查找账户
    public List<Account> findAll();
}
