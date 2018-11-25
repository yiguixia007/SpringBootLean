package com.ego.core.mybatistx.web.controller;

import com.ego.core.mybatistx.service.AccountService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ego
 * @since 2018-11-25 16:06
 **/
@RestController
@RequestMapping("/account")
@MapperScan("com.ego.core.mybatistx.dao")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "transfer", method = RequestMethod.GET)
    public void transfer(){
        accountService.transfer();
    }
}
