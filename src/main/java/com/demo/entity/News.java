package com.demo.entity;

import java.io.Serializable;

public class News implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer nid;
    private String title;
    private Integer uid;
    /**
     * 发布用户名
     */
    private String uname;
    private String releaseTime;
    private String nContent;
    private Integer sortId;
    /**
     * 类别名
     */
    private String sortName;
    private Integer clicks;
    private String cover;
    /**
     * 排序方式(1为时间倒叙 2为点击数)
     */
    private Integer order;
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

    public News() {
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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

    public News(Integer nid, String title, Integer uid, String uname, String releaseTime, String nContent, Integer sortId, String sortName, Integer clicks, String cover, Integer order, Integer pageNumber, Integer pageSize, Integer pageIndex) {
        this.nid = nid;
        this.title = title;
        this.uid = uid;
        this.uname = uname;
        this.releaseTime = releaseTime;
        this.nContent = nContent;
        this.sortId = sortId;
        this.sortName = sortName;
        this.clicks = clicks;
        this.cover = cover;
        this.order = order;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    @Override
    public String toString() {
        return "News{" +
                "nid=" + nid +
                ", title='" + title + '\'' +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", nContent='" + nContent + '\'' +
                ", sortId=" + sortId +
                ", sortName='" + sortName + '\'' +
                ", clicks=" + clicks +
                ", cover='" + cover + '\'' +
                ", order=" + order +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                '}';
    }
}
