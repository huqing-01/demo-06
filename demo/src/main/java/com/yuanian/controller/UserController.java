package com.yuanian.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yuanian.pojo.User;
import com.yuanian.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    //注入service
    @Autowired
    private UserService userService;

    //根据userCode查询单个用户信息
    @RequestMapping("user/{userCode}")
    public User findByUserCode(@PathVariable(value = "userCode") String userCode){
        System.out.println(userCode);
        return this.userService.findByUserCode(userCode);
    }

    //查询所有用户信息
    @RequestMapping("user")
    public List<User> findAllUser(){
        return this.userService.findAllUser();
    }

    //增加用户信息
    @RequestMapping("addUser")
    public void addUser(User user){
        user.setUserCode("10");
        user.setUserName("杨广强");
        user.setDepartment("人力资源部");
        this.userService.addUser(user);
        System.out.println(user);
    }

    //删除用户信息，根据userCode删除
    @RequestMapping("deleteByUserCode")
    public void deleteByUserCode(String userCode){
        //userCode = "9";
        System.out.println(userCode);
        this.userService.deleteByUserCode(userCode);

    }

    //修改用户信息，根据userCode修改
    @RequestMapping("updateUser")
    public void updateUser(User user){
        user.setUserCode("6");
        user.setUserName("李小飞");
        user.setDepartment("生产部");
        this.userService.updateUser(user);
    }

}
