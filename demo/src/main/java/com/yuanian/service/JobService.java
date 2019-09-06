package com.yuanian.service;

import com.yuanian.Mapper.JobMapper;
import com.yuanian.pojo.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JobService {

    //注入职位mapper
    @Autowired
    private JobMapper jobMapper;

    //增加职位信息
    public void addJob(Job job){
        this.jobMapper.addJob(job);
    }

    //删除  根据jid删除职位信息
    public void deleteByJid(String jid){
        this.jobMapper.deleteByJid(jid);
    }

    //查询所有职位信息
    public List<Job> findAllJob(){
        return this.jobMapper.findAllJob();
    }

    //根据jid查询一个职位的信息
    public Job findByJid(String jid){
        return this.jobMapper.findByJid(jid);
    }

    //修改  根据jid修改职位信息
    public void updateJob(Job job){
        this.jobMapper.updateJob(job);
    }


}
