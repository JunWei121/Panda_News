package com.demo.service.impl;

import com.demo.dao.SysUserDao;
import com.demo.entity.SysUser;
import com.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 管理员业务层
 */
@Transactional
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    /**
     * 注入Dao依赖
     */
    @Autowired
    private SysUserDao sysUserDao;

    /**
     * 展示所有管理员
     *
     * @return
     */
    @Override
    public List<SysUser> findAllSysUsers() {
        List<SysUser> sysUsers = sysUserDao.selectAllSysUser();
        for (SysUser u : sysUsers
        ) {
            System.out.println(u);
        }
        return sysUsers;
    }

    /**
     * 根据账号和密码查找用户
     *
     * @param sname
     * @param spwd
     * @return
     */
    @Override
    public SysUser fingByAccount(String sname, String spwd) {
        SysUser sysUser = sysUserDao.selectByAccount(sname, spwd);
        return sysUser;
    }

    /**
     * 根据条件查找管理员
     *
     * @param sysUser
     * @return
     */
    @Override
    public List<SysUser> findSysUserList(SysUser sysUser) {
        List<SysUser> userList = sysUserDao.selectSysUserList(sysUser);
        return userList;
    }

    /**
     * 根据管理员账号查找 状态
     *
     * @param sname
     * @return
     */
    @Override
    public Integer findSysUserState(String sname) {
        Integer state = sysUserDao.selectSysUserState(sname);
        return state;
    }

    /**
     * 添加管理员
     *
     * @param sysUser
     * @return
     */
    @Override
    public Integer addSysUser(SysUser sysUser) {
        Integer i = sysUserDao.addSysUser(sysUser);
        return i;
    }

    /**
     * 禁用
     *
     * @param sid
     * @return
     */
    @Override
    public Integer modStateDisable(Integer sid) {
        Integer integer = sysUserDao.updateStateDisable(sid);
        return integer;
    }

    /**
     * 启用
     *
     * @param sid
     * @return
     */
    @Override
    public Integer modStateEnable(Integer sid) {
        Integer integer = sysUserDao.updateStateEnable(sid);
        return integer;
    }
}
