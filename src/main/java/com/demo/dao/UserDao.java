package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    @Select("select * from user where uid = #{uid}")
    public User findUserById(Integer uid);


    /**
     * 按条件查询所有用户
     */
    public List<User> selectListUser(User user);

    /**
     * 禁用用户(isVerify修改为0)
     */
    @Update("update user set isVerify = 0 where uid = #{uid}")
    public Integer updateVerifyDisable(Integer uid);

    /**
     * 认证用户(isVerify修改为1)
     */
    @Update("update user set isVerify = 1 where uid = #{uid}")
    public Integer updateVerifyEnable(Integer uid);

    /**
     * 添加用户
     */
    @Insert("INSERT INTO `panda`.`user`(`Uname`, `Upwd`, `uCreatetime`) VALUES (#{uname}, #{upwd}, #{uCreatetime}) ")
    public Integer insertUser(User user);

    /**
     * 用密码和账号查询用户
     */
    @Select("select * from user where uname = #{uname} and upwd = #{upwd}")
    public User selectByAccount(User user);

    /**
     * 根据id修改头像地址
     */
    @Update("UPDATE `panda`.`user` SET `Hpath` = #{hPath} WHERE `UId` = #{uid} ")
    public Integer updatePhoto(User user);

    @Update("UPDATE `panda`.`user` SET `Uname` = #{uname}, `Upwd` = #{upwd} WHERE `UId` = #{uid}")
    public Integer updateAccount(User user);
}
