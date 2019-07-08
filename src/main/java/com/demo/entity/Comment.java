package com.demo.entity;

import java.io.Serializable;

/**
 * 评论持续层
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer cid;
    private Integer nid;
    /**
     * 新闻标题
     */
    private String title;
    private Integer uid;
    private String uname;
    private String CReleaseTime;
    private String cContent;
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

    public Comment() {
    }





    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getCReleaseTime() {
        return CReleaseTime;
    }

    public void setCReleaseTime(String CReleaseTime) {
        this.CReleaseTime = CReleaseTime;
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

    public Comment(Integer cid, Integer nid, String title, Integer uid, String uname, String CReleaseTime, String cContent, Integer pageNumber, Integer pageSize, Integer pageIndex) {
        this.cid = cid;
        this.nid = nid;
        this.title = title;
        this.uid = uid;
        this.uname = uname;
        this.CReleaseTime = CReleaseTime;
        this.cContent = cContent;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", nid=" + nid +
                ", title='" + title + '\'' +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", CReleaseTime='" + CReleaseTime + '\'' +
                ", cContent='" + cContent + '\'' +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }
}
