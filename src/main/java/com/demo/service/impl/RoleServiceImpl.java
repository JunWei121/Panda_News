package com.demo.service.impl;

import com.demo.dao.RoleDao;
import com.demo.entity.Role;
import com.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色访问业务层
 */
@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    /**
     * 显示所有角色
     *
     * @return
     */
    @Override
    public List<Role> findAllRoles() {
        List<Role> roles = roleDao.selectRole();
        return roles;
    }

    /**
     * 根据id删除角色
     *
     * @param
     * @return
     */
    @Override
    public Integer deleteRoleByRid(Integer rid) {
        Integer integer = roleDao.deleteRoleByRid(rid);
        return integer;
    }

    /**
     * 添加角色
     *
     * @param role
     * @return
     */
    @Override
    public Integer insertRole(Role role) {
        Integer integer = roleDao.insertRole(role);
        return integer;
    }

    /**
     * 根据Id查找角色
     * @param rid
     * @return
     */
    @Override
    public Role findAllRoleById(Integer rid) {
        Role role = roleDao.selectRoleById(rid);
        return role;
    }

}
