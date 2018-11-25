package com.ego.core.mybatistx.service;

import com.ego.core.mybatistx.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ego
 * @since 2018-11-25 16:01
 **/
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    public void transfer() throws RuntimeException{
        accountMapper.update(14D,4);//用户4减4块 用户8加4块
        int i = 1/0;
        accountMapper.update(18D,8);
    }
}
