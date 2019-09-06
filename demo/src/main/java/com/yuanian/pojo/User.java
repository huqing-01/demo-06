package com.yuanian.pojo;

import java.sql.Date;

public class User {
    private String userCode;      //用户工号
    private String userName;      //用户名字
    private String department;    //所在部门

    public User(String userCode, String userName, String department) {
        this.userCode = userCode;
        this.userName = userName;
        this.department = department;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
