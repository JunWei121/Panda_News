package com.demo.entity;

public class Verify {
    private Integer vid;
    private Integer uid;
    private String uname;
    private String vCreatetime;
    private String vContent;
    /**
     * 1为未处理
     */
    private Integer isDeal;

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

    public Verify() {
    }


    public Verify(Integer vid, Integer uid, String uname, String vCreatetime, String vContent, Integer isDeal, Integer pageNumber, Integer pageSize, Integer pageIndex) {
        this.vid = vid;
        this.uid = uid;
        this.uname = uname;
        this.vCreatetime = vCreatetime;
        this.vContent = vContent;
        this.isDeal = isDeal;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "Verify{" +
                "vid=" + vid +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", vCreatetime='" + vCreatetime + '\'' +
                ", vContent='" + vContent + '\'' +
                ", isDeal=" + isDeal +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                '}';
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

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getvCreatetime() {
        return vCreatetime;
    }

    public void setvCreatetime(String vCreatetime) {
        this.vCreatetime = vCreatetime;
    }

    public String getvContent() {
        return vContent;
    }

    public void setvContent(String vContent) {
        this.vContent = vContent;
    }

    public Integer getIsDeal() {
        return isDeal;
    }

    public void setIsDeal(Integer isDeal) {
        this.isDeal = isDeal;
    }
}
