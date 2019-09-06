package com.yuanian.pojo;

import java.sql.Date;

public class User_Job {

    private String id;             //这里是关联两个表  id
    private String userCode;       //用户工号
    private String jid;            //职位的jid
    private Date hireDate;         //入职时间

    public User_Job(String id, String userCode, String jid, Date hireDate) {
        this.id = id;
        this.userCode = userCode;
        this.jid = jid;
        this.hireDate = hireDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
