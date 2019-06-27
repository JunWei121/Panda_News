package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao UserDao;

    @Override
    public User findUserById(Integer uid) {
        User user = UserDao.findUserById(uid);
        return user;
    }

    /**
     * 根据找好和密码 查找用户
     *
     * @param userCode
     * @param userPwd
     * @return
     */
    @Override
    public User findUser(String userCode, String userPwd) {
        User user = UserDao.findUser(userCode, userPwd);
        return user;
    }
}
