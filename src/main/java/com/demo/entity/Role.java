package com.demo.entity;

import java.io.Serializable;

/**
 * 角色 实体类(持久层)
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer rid;
    private String rname;
    private Integer oprSys;
    private Integer oprUser;
    private Integer oprNews;
    private Integer oprComment;

    public Role(Integer rid, String rname, Integer oprSys, Integer oprUser, Integer oprNews, Integer oprComment) {
        this.rid = rid;
        this.rname = rname;
        this.oprSys = oprSys;
        this.oprUser = oprUser;
        this.oprNews = oprNews;
        this.oprComment = oprComment;
    }

    public Role() {
    }

    public Integer getOprSys() {
        return oprSys;
    }

    public void setOprSys(Integer oprSys) {
        this.oprSys = oprSys;
    }

    public Integer getOprUser() {
        return oprUser;
    }

    public void setOprUser(Integer oprUser) {
        this.oprUser = oprUser;
    }

    public Integer getOprNews() {
        return oprNews;
    }

    public void setOprNews(Integer oprNews) {
        this.oprNews = oprNews;
    }

    public Integer getOprComment() {
        return oprComment;
    }

    public void setOprComment(Integer oprComment) {
        this.oprComment = oprComment;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", oprSys=" + oprSys +
                ", oprUser=" + oprUser +
                ", oprNews=" + oprNews +
                ", oprComment=" + oprComment +
                '}';
    }
}
