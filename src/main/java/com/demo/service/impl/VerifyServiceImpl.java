package com.demo.service.impl;

import com.demo.dao.VerifyDao;
import com.demo.entity.Verify;
import com.demo.service.VerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("verifyService")
public class VerifyServiceImpl implements VerifyService {

    @Autowired
    private VerifyDao verifyDao;


    @Override
    public List<Verify> findListverify(Verify verify) {
        List<Verify> verifyList = verifyDao.selectListVerify(verify);
        return verifyList;
    }

    /**
     * 处理申请
     *
     * @param vid
     * @return
     */
    @Override
    public Integer modIsDeal(Integer vid) {
        Integer integer = verifyDao.updateIsDeal(vid);
        return integer;
    }

    /**
     * 根据vid查找Verify
     *
     * @param vid
     * @return
     */

    @Override
    public Verify findUidByVid(Integer vid) {
        Verify verify = verifyDao.selectUidByVid(vid);
        return verify;
    }

    @Override
    public Integer addVerify(Verify verify) {
        Integer integer = verifyDao.insertVerify(verify);
        return integer;
    }


}
