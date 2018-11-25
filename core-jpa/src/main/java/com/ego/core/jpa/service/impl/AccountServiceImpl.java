package com.ego.core.jpa.service.impl;


import com.ego.core.jpa.dao.AccountDao;
import com.ego.core.jpa.entity.Account;
import com.ego.core.jpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ego
 * @since 2018-11-18 16:13
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDAO;

    @Override
    public Account add(Account account) {
        return accountDAO.save(account);
    }

    @Override
    public Account update(Account account) {
        return accountDAO.save(account);
    }

    @Override
    public void delete(int id) {
         accountDAO.deleteById(id);
    }

    @Override
    public Account findAccountById(int id) {
        Optional<Account> ops = accountDAO.findById(id);
        return ops.get();
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAll();
    }
}
