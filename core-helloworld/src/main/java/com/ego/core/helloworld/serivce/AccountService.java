package com.ego.core.helloworld.serivce;


import com.ego.core.helloworld.entity.Account;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-18 16:12
 **/
public interface AccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
