package com.yuanian.controller;

import com.yuanian.pojo.Job;
import com.yuanian.pojo.User;
import com.yuanian.service.JobService;
import com.yuanian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Login {
    @Autowired
    private UserService userService;

    @Autowired
    private JobService jobService;

    @RequestMapping("login")
    public String login(HttpServletRequest request){
        String userCode = request.getParameter("userCode");
        String userName = request.getParameter("userName");
        User user = userService.findByUserCode(userCode);
        if (userName.equals(user.getUserName()))
            return "index";
        else
            return "login";
    }

}
