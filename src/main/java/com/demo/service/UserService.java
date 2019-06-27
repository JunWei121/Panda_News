package com.demo.service;

import com.demo.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

    public User findUserById(Integer uid);


    public User findUser(String userCode,String userPwd);
}
