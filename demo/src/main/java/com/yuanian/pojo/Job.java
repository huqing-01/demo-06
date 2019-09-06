package com.yuanian.pojo;

public class Job {

    private String jid;         //工作id
    private String position;    //职位
    private String content;     //工作内容

    public Job(String jid, String position, String content) {
        this.jid = jid;
        this.position = position;
        this.content = content;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
