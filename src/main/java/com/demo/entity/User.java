package com.demo.entity;

import java.io.Serializable;

/**
 * 用户持久化类
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer uid;
    private String uname;
    private String upwd;
    private String uCreatetime;
    /**
     * 头像地址
     */
    private String hPath;
    /**
     * 是否认证
     */
    private Integer isVerify;

    /**
     * 页码
     */
    private Integer pageNumber;
    /**
     * 每页数据数
     */
    private Integer pageSize;

    /**
     * 索引
     */
    private Integer pageIndex;



    public User() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getuCreatetime() {
        return uCreatetime;
    }

    public void setuCreatetime(String uCreatetime) {
        this.uCreatetime = uCreatetime;
    }

    public String gethPath() {
        return hPath;
    }

    public void sethPath(String hPath) {
        this.hPath = hPath;
    }

    public Integer getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Integer isVerify) {
        this.isVerify = isVerify;
    }

    public User(Integer uid, String uname, String upwd, String uCreatetime, String hPath, Integer isVerify, Integer pageNumber, Integer pageSize, Integer pageIndex) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.uCreatetime = uCreatetime;
        this.hPath = hPath;
        this.isVerify = isVerify;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uCreatetime='" + uCreatetime + '\'' +
                ", hPath='" + hPath + '\'' +
                ", isVerify=" + isVerify +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                '}';
    }
}
