package com.demo.entity;

import java.io.Serializable;

/**
 * 新闻类别
 */
public class Sort implements Serializable {
    private Integer sortId;
    private String sortName;

    public Sort() {
    }

    public Sort(Integer sortId, String sortName) {
        this.sortId = sortId;
        this.sortName = sortName;
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

    @Override
    public String toString() {
        return "Sort{" +
                "sortId=" + sortId +
                ", sortName='" + sortName + '\'' +
                '}';
    }
}
