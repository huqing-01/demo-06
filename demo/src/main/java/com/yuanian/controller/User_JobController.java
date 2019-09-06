package com.yuanian.controller;

import com.yuanian.Mapper.User_JobMapper;
import com.yuanian.pojo.Job;
import com.yuanian.pojo.User;
import com.yuanian.pojo.User_Job;
import com.yuanian.service.JobService;
import com.yuanian.service.UserService;
import com.yuanian.service.User_JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin
public class User_JobController {

    //注入service
    @Autowired
    private User_JobService user_jobService;

    @Autowired
    private UserService userService;

    @Autowired
    private JobService jobService;
    //增加
    @RequestMapping("user_job/{id}")
    public Map findByIds(@PathVariable(value = "id") String id){
        System.out.println(id);
//        System.out.println(this.user_jobService.findById(id));
//        return this.user_jobService.findById(id);
        User_Job user_job = user_jobService.findById(id);
        User user = userService.findByUserCode(user_job.getUserCode());
        Job job = jobService.findByJid(user_job.getJid());

//        List<String> list = new ArrayList<>();
//        //list.add(user_job.getJid());
//        list.add(user_job.getUserCode());
//        list.add(user.getUserName());
//        list.add(user.getDepartment());
//        list.add(job.getPosition());
//        list.add(job.getContent());
//        list.add(String.valueOf(user_job.getHireDate()));

        Map map = new HashMap();
        map.put("id",user_job.getId());  //加入id
        map.put("userCode",user_job.getUserCode());  //加入用户工号
        map.put("userName",user.getUserName());      //加入用户姓名
        map.put("department",user.getDepartment());  //加入用户所在部门
        map.put("position",job.getPosition());       //加入对应的职位
        map.put("content",job.getContent());         //加入对应的工作内容
        map.put("hireDate",String.valueOf(user_job.getHireDate()));  //加入入职时间
        return map;
    }
}
