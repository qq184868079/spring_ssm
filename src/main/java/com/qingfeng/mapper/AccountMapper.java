package com.qingfeng.mapper;


import com.qingfeng.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface AccountMapper {

    //添加账户
    @Insert("insert into account values (null,#{name},#{money})")
    public void save(Account account);

    //查找账户
    @Select("select * from account")
    public List<Account> findAll();

}
