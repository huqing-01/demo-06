package com.yuanian.Mapper;

import com.yuanian.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
//@Repository
public interface UserMapper {

    //增  增加整个用户
    @Insert("insert into user(userCode,userName,department) values(#{userCode},#{userName},#{department})")
    void addUser(User user);

    //删 根据userCode删除
    @Delete("delete from user where userCode = #{userCode}")
    void deleteByUserCode(String userCode);

    //查询所有用户信息
    @Select("select * from user")
    List<User> findAllUser();

    //查--根据userCode查
    @Select("select * from user where userCode = #{userCode}")
    public User findByUserCode(String userCode);

    //改 根据userCode更改用户信息
    @Update("update user set userName=#{userName},department=#{department} where userCode = #{userCode}")
    void updateUser(User user);
}
