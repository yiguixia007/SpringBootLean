package com.ego.core.jpa.web.controller;


import com.ego.core.jpa.entity.Account;
import com.ego.core.jpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-24 11:38
 **/
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/list")
    public List<Account> getAccountList(){
        return accountService.findAccountList();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id")int id){
        Account account = accountService.findAccountById(id);
        return account;
    }

    @PutMapping("/{id}")
    public String updateAccount(@PathVariable("id")int id,@RequestParam(value = "name") String name,
                                @RequestParam(value = "money") double money){
        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(money);

        Account result = accountService.update(account);
        return result.toString();
    }

    @PostMapping("")
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money){
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);

        Account result = accountService.add(account);
        return result.toString();
    }
}
