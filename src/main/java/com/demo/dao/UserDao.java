package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from user where uid = #{uid}")
    public User findUserById(Integer uid);

    /**
     * 根据账号和密码 查找用户
     *
     * @param userCode
     * @param userPwd
     * @return
     */
    @Select("select * from sys_user where user_code = #{userCode} and user_password = #{userPwd} and user_state = 1")
    public User findUser(@Param("userCode") String userCode, @Param("userPwd") String userPwd);
}
