package com.demo.pojo;

import com.demo.entity.Comment;

import java.util.List;

public class CommentResult {

    private Integer total;
    private List<Comment> rows;

    public CommentResult() {
    }

    public CommentResult(Integer total, List<Comment> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Comment> getRows() {
        return rows;
    }

    public void setRows(List<Comment> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "CommentResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
