package com.yuanian.controller;

import com.yuanian.pojo.Job;
import com.yuanian.service.JobService;
import com.yuanian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class JobController {

    //注入service
    @Autowired
    private JobService jobService;

    //根据jid查询单个职位信息
    @RequestMapping("job/{jid}")
    public Job findByJid(@PathVariable(value = "jid") String jid){
        return jobService.findByJid(jid);
    }

    //查询所有职位信息
    @RequestMapping("job")
    public List<Job> findAllJob(){
        return jobService.findAllJob();
    }

    //增加职位信息
    @RequestMapping("addJob")
    public void addJob(Job job){
//        job.setJid("9");
//        job.setPosition("采购员");
//        job.setContent("买东西的");
        this.jobService.addJob(job);
        System.out.println(job);
    }

    //删除  根据jid删除职位信息
    @RequestMapping("delete/{jid}")
    public void deleteByJid(@PathVariable(value = "jid") String jid){
        this.jobService.deleteByJid(jid);
    }

    //修改  根据jid修改职位信息
    @RequestMapping("updateJob")
    public void updateJob(Job job){
        job.setJid("8");
        job.setPosition("采购员");
        job.setContent("买东西的");
        this.jobService.updateJob(job);
    }

}
