package com.demo.pojo;

import com.demo.entity.User;

import java.util.List;

/**
 * 用户分页查询返回结果封装类
 */
public class UserResult {
    private Integer total;
    private List<User> rows;

    public UserResult() {
    }

    public UserResult(Integer total, List<User> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<User> getRows() {
        return rows;
    }

    public void setRows(List<User> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "UserResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
