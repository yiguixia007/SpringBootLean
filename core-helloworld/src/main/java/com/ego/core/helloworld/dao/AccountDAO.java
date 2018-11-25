package com.ego.core.helloworld.dao;

import com.ego.core.helloworld.entity.Account;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-25 10:05
 **/
public interface AccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
