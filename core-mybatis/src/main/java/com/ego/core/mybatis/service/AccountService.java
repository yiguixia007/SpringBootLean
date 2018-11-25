package com.ego.core.mybatis.service;

import com.ego.core.mybatis.dao.AccountMapper;
import com.ego.core.mybatis.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-25 15:20
 **/
@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }

    public int update(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }

    public int delete(int id) {
        return accountMapper.delete(id);
    }

    public Account findById(int id) {
        return accountMapper.findById(id);
    }

    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
