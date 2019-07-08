package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Integer uid) {
        User user = userDao.findUserById(uid);
        return user;
    }

    /**
     * 根据条件查找用户
     *
     * @param user
     * @return
     */
    @Override
    public List<User> findListUser(User user) {
        List<User> userList = userDao.selectListUser(user);
        return userList;
    }

    /**
     * 禁用用户
     *
     * @param uid
     * @return
     */
    @Override
    public Integer modVerifyDisable(Integer uid) {
        Integer integer = userDao.updateVerifyDisable(uid);
        return integer;
    }

    /**
     * 认证用户
     *
     * @param uid
     * @return
     */
    @Override
    public Integer modVerifyEnable(Integer uid) {
        Integer integer = userDao.updateVerifyEnable(uid);
        return integer;
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Override
    public Integer addUser(User user) {
        Integer integer = userDao.insertUser(user);
        return integer;
    }

    /**
     * 按账号和密码查找用户
     *
     * @param user
     * @return
     */
    @Override
    public User findByAccount(User user) {
        User user1 = userDao.selectByAccount(user);
        return user1;
    }

    /**
     * 根据id修改头像
     *
     * @param user
     * @return
     */
    @Override
    public Integer modPhoto(User user) {
        Integer integer = userDao.updatePhoto(user);
        return integer;
    }

    @Override
    public Integer modAccount(User user) {
        Integer integer = userDao.updateAccount(user);
        return integer;
    }

}
