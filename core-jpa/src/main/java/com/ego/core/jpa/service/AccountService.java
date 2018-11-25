package com.ego.core.jpa.service;



import com.ego.core.jpa.entity.Account;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-18 16:12
 **/
public interface AccountService {

    Account add(Account account);

    Account update(Account account);

    void delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
