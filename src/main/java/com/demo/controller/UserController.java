package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping("/findOneUser")
    public String findOneUser(Integer uid, Model Model) {
        User user = UserService.findUserById(uid);
        Model.addAttribute("USER", user);
        return "user";
    }

    @RequestMapping("/login.action")
    public Map<String, Object> findUser(String userCode, String userPwd, ModelAndView modelAndView, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        User user = UserService.findUser(userCode, userPwd);
        if (user != null) {
            session.setAttribute("USER_SESSION", user);
            map.put("USER", user);
            modelAndView.setViewName("houtai");
            return map;
        }
        modelAndView.setViewName("login");
        map.put("msg", "错误");
        return map;
    }
}
