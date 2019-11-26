package com.qingfeng.service.impl;

import com.qingfeng.domain.Account;
import com.qingfeng.mapper.AccountMapper;
import com.qingfeng.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.qingfeng.service.impl
 * @ClassName: AccountServiceImpl
 * @Author: QingFeng
 * @Date: 2019-11-19 20:25
 * @Description: //TODO
 */
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void save(Account account) {
       accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
       return accountMapper.findAll();
    }
}
