package com.yuanian.Mapper;

import com.yuanian.pojo.Job;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface JobMapper {

    //增加职位
    @Insert("insert into job(jid,position,content) values(#{jid},#{position},#{content})")
    void addJob(Job job);

    //删除职位  根据jid删除
    @Delete("delete from job where jid=#{jid}")
    void deleteByJid(String jid);

    //查询所有职位信息
    @Select("select * from job")
    List<Job> findAllJob();

    //查询一个职位的信息  根据jid查
    @Select("select * from job where jid=#{jid}")
    Job findByJid(String jid);

    //更新
    @Update("update job set position=#{position} , content=#{content} where jid=#{jid}")
    void updateJob(Job job);
}
