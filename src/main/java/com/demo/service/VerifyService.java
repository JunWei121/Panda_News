package com.demo.service;

import com.demo.entity.Verify;

import java.util.List;

public interface VerifyService {

    public List<Verify> findListverify(Verify verify);

    public Integer modIsDeal(Integer vid);

    public Verify findUidByVid(Integer vid);

    public Integer addVerify(Verify verify);
}
