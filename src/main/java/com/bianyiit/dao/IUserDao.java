package com.bianyiit.dao;

import com.bianyiit.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @Author zeika
 * @Date 2020/8/25 11:20
 */
public interface IUserDao {

    @Select("select * from user")
    List<User> selectAll();

    @Insert("insert into user values(null,#{username},#{password},#{sex},#{birthday})")
    void insertUser(User user);
}
