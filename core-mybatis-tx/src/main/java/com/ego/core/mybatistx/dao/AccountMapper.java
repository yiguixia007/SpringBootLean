package com.ego.core.mybatistx.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ego
 * @since 2018-11-25 15:57
 **/
@Repository
public interface AccountMapper {
    int update(@Param("money")double money,@Param("id")int id);
}
