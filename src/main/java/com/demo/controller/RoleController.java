package com.demo.controller;

import com.demo.entity.Role;
import com.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色控制层
 */
@Controller
@RequestMapping("/sys/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 显示所有角色 返回json数据
     */
    @RequestMapping("/loadRole.action")
    @ResponseBody
    public List<Role> findRoles() {
        List<Role> allRoles = roleService.findAllRoles();
        return allRoles;
    }

    /**
     * 角色删除功能
     */
    @RequestMapping(value = "/delete.action", method = RequestMethod.POST)
    @ResponseBody
    public String deleteRole(Integer[] ids) {
        for (Integer id : ids) {
            Integer integer = roleService.deleteRoleByRid(id);
            if (integer < 1) {
                return "FAIL";
            }
        }
        return "OK";
    }

    /**
     * 添加角色
     */
    @RequestMapping(value = "/create.action",method = RequestMethod.POST)
    @ResponseBody
    public String createRole(Role role) {
        Integer integer = roleService.insertRole(role);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

}
