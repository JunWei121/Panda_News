package com.demo.entity;

import java.io.Serializable;

/**
 * 管理员实体
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer sid;
    private String sname;
    private String spwd;
    /**
     * 角色标识
     */
    private Integer rid;
    /**
     * 收件箱
     */
    private String inbox;
    private String createtime;
    /**
     * 账号状态
     */
    private Integer state;
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

    /**
     * 角色名
     */
    private String rname;

    public SysUser() {
    }

    public SysUser(Integer sid, String sname, String spwd, Integer rid, String inbox, String createtime, Integer state, Integer pageNumber, Integer pageSize, Integer pageIndex, String rname) {
        this.sid = sid;
        this.sname = sname;
        this.spwd = spwd;
        this.rid = rid;
        this.inbox = inbox;
        this.createtime = createtime;
        this.state = state;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.rname = rname;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getInbox() {
        return inbox;
    }

    public void setInbox(String inbox) {
        this.inbox = inbox;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", spwd='" + spwd + '\'' +
                ", rid=" + rid +
                ", inbox='" + inbox + '\'' +
                ", createtime='" + createtime + '\'' +
                ", state=" + state +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                ", rname='" + rname + '\'' +
                '}';
    }
}
