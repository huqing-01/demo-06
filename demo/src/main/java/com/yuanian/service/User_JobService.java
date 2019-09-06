package com.yuanian.service;

import com.yuanian.Mapper.User_JobMapper;
import com.yuanian.pojo.User_Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class User_JobService {

    //注入用户角色mapper
    @Autowired
    private User_JobMapper user_jobMapper;

    //增加
    public User_Job findById(String id){
        return this.user_jobMapper.findById(id);
    }


}
