package com.demo.dao;

import com.demo.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 管理员数据访问对象
 */
public interface SysUserDao {
    /**
     * 显示所有管理员
     *
     * @return
     */
    @Select("SELECT * FROM sys_user")
    public List<SysUser> selectAllSysUser();

    /**
     * 根据账号和密码查询管理员
     */
    @Select("select * from sys_user where Sname = #{sname} and Spwd = #{spwd}")
    public SysUser selectByAccount(@Param("sname") String sname, @Param("spwd") String spwd);

    /**
     * 根据条件检索管理员
     */
    public List<SysUser> selectSysUserList(SysUser SysUser);

    /**
     * 验证管理员状态
     */
    @Select("select state from sys_user where sname = #{sname}")
    public Integer selectSysUserState(String sname);

    /**
     * 添加管理员
     */
    @Insert("insert into sys_user(sname,spwd,rid,createtime,state) values(#{sname},#{spwd},#{rid},#{createtime},#{state})")
    public Integer addSysUser(SysUser sysUser);

    /**
     * 禁用管理员(state修改为0)
     */
    @Update("update sys_user set state = 0 where sid = #{sid}")
    public Integer updateStateDisable(Integer sid);

    /**
     * 启用管理员(state修改为1)
     */
    @Update("update sys_user set state = 1 where sid = #{sid}")
    public Integer updateStateEnable(Integer sid);
}
