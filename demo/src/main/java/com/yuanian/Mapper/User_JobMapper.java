package com.yuanian.Mapper;

import com.yuanian.pojo.User_Job;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

@Mapper
public interface User_JobMapper {

    //查询单条记录
//    @Select("select u.userCode,u.userName,u.department,j.jid,j.position,j.content,uj.hireDate from user_job uj left join user u on" +
//    @Select("select id,u.userCode,j.jid,hireDate from user_job uj left join user u on " +
//            " u.userCode=uj.userCode left join job j on j.jid=uj.jid where id = #{id}")
    @Select("select * from user_job  where id = #{id}")
    public User_Job findById(String id);
//    //查--根据userCode查
//    @Select("select * from user where userCode = #{userCode}")
//    public User findByUserCode(String userCode);
//    @Results({
//            @Result(id=true,property ="id",column = "id"),
//            @Result(property = "user.userCode",column = "userCode"),
//            @Result(property ="job.jid",column = "jid"),
//            @Result(property = "hireDate",column = "hireDate"),
//            @Result(column = "userCode",property = "user",one = @One(select = "com.yuanian.Mapper.UserMapper.findByUserCode",fetchType=FetchType.LAZY)),
//            @Result(column = "jid",property = "job",one = @One(select = "com.yuanian.Mapper.JobMapper.findByJid",fetchType=FetchType.LAZY))
//    })

//            " u.userCode=uj.userCode left join job j on j.jid=uj.jid where id = #{id}")


//    @Results({
//            @Result(column="empId",property="empId",id=true),//id=true，表示为主键
//            @Result(column="empName",property="empName"),
//            @Result(column="empBirthDay",property="empBirthDay"),
//            @Result(column="empSex",property="empSex"),
//            @Result(column="deptId",property="dept",one=@One(select="com.mybatisstudy.dao.IDepartmentDao.selectDeptById",fetchType=FetchType.EAGER))})
//    @Select("SELECT * FROM tb_emp WHERE empBirthDay between #{startTime} and #{endTime} ;")


}
