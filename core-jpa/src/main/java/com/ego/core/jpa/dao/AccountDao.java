package com.ego.core.jpa.dao;

import com.ego.core.jpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ego
 * @since 2018-11-25 10:37
 **/
public interface AccountDao extends JpaRepository<Account, Integer>{
}
