package com.qingfeng.controller;

import com.qingfeng.domain.Account;
import com.qingfeng.service.AccountService;
import com.qingfeng.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @PackageName: com.qingfeng.controller
 * @ClassName: AccountController
 * @Author: QingFeng
 * @Date: 2019-11-19 20:42
 * @Description: //TODO
 */
@Controller
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save",produces = "text/html;charset=utf-8")

    public String save(Account account){
        accountService.save(account);
        return "find";
    }

    @RequestMapping("/findall")
    public ModelAndView findAll(){

        List<Account> all = accountService.findAll();

        ModelAndView andView = new ModelAndView();

        andView.addObject("account",all);
        andView.setViewName("findall");
        return andView;
    }
}
