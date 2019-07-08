package com.demo.pojo;

import com.demo.entity.News;

import java.util.List;

public class NewsResult {
    private Integer total;
    private List<News> rows;

    public NewsResult() {
    }

    public NewsResult(Integer total, List<News> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<News> getRows() {
        return rows;
    }

    public void setRows(List<News> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "NewsResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
