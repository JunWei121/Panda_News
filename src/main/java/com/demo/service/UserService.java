package com.demo.service;

import com.demo.entity.User;

import java.util.List;

public interface UserService {

    public User findUserById(Integer uid);


    public List<User> findListUser(User user);

    public Integer modVerifyDisable(Integer uid);

    public Integer modVerifyEnable(Integer uid);

    public Integer addUser(User user);

    public User findByAccount(User user);

    public Integer modPhoto(User user);

    public Integer modAccount(User user);
}
