package com.demo.pojo;

import com.demo.entity.Verify;

import java.util.List;

public class VerifyResult {
    private Integer total;
    private List<Verify> rows;

    public VerifyResult(Integer total, List<Verify> rows) {
        this.total = total;
        this.rows = rows;
    }

    public VerifyResult() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Verify> getRows() {
        return rows;
    }

    public void setRows(List<Verify> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "VerifyResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
