package com.yuanian.service;

import com.yuanian.Mapper.UserMapper;
import com.yuanian.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserService {
    //注入用户mapper
    @Autowired
    private UserMapper userMapper;

    //增
    public void addUser(User user){
        this.userMapper.addUser(user);
    }

    //删
    public void deleteByUserCode(String userCode){
        this.userMapper.deleteByUserCode(userCode);
    }

    //查询所有
    public List<User> findAllUser(){
        return this.userMapper.findAllUser();
    }

    //根据工号userCode查询一个用户信息
    public User findByUserCode(String userCode){
        return this.userMapper.findByUserCode(userCode);
    }

    //改
    public void updateUser(User user){
        this.userMapper.updateUser(user);
    }
}
