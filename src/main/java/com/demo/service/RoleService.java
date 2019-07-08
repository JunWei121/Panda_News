package com.demo.service;


import com.demo.entity.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAllRoles();

    public Integer deleteRoleByRid(Integer rid);

    public Integer insertRole(Role role);

    public Role findAllRoleById(Integer rid);
}
