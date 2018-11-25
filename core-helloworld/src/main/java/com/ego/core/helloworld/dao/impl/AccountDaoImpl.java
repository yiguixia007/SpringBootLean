package com.ego.core.helloworld.dao.impl;

import com.ego.core.helloworld.dao.AccountDao;
import com.ego.core.helloworld.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-25 10:06
 **/
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(name, money) values(?, ?)", account.getName(), account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("update  account set name=? ,money=? where id=?", account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from table account where id=?", id);
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> accountList =  jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Account.class));

        if(CollectionUtils.isEmpty(accountList)){
            return null;
        }

        return accountList.get(0);
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> accountList = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));

        if (CollectionUtils.isEmpty(accountList)){
            return null;
        }

        return accountList;
    }
}
