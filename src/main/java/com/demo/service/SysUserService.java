package com.demo.service;

import com.demo.entity.SysUser;

import java.util.List;

/**
 * 系统管理员业务接口
 */
public interface SysUserService {

    public List<SysUser> findAllSysUsers();

    public SysUser fingByAccount(String sname,String spwd);

    public List<SysUser> findSysUserList(SysUser sysUser);

    public Integer findSysUserState(String sname);

    public Integer addSysUser(SysUser sysUser);

    public Integer modStateDisable(Integer sid);

    public Integer modStateEnable(Integer sid);
}
