package com.ego.core.mybatis.dao;

import com.ego.core.mybatis.entity.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author ego
 * @since 2018-11-25 14:25
 **/
@Mapper
public interface AccountMapper {

    @Insert("insert into account(name,money) value (#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update account set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money,@Param("id")int id);

    @Delete("delete from account where id =#{id}")
    int delete(@Param("id") int id );

    @Select("select * from account where id = #{id}")
    Account findById(@Param("id") int id);

    @Select("select * from account")
    List<Account> findAll();
}
