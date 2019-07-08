package com.demo.pojo;

import com.demo.entity.SysUser;

import java.util.List;

/**
 * 管理员分页查询返回结果封装类
 */
public class PageResult {
    private Integer total;
    private List<SysUser> rows;

    public PageResult() {
    }

    public PageResult(Integer total, List<SysUser> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<SysUser> getRows() {
        return rows;
    }

    public void setRows(List<SysUser> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
