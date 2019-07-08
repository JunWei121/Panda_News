package com.demo.dao;

import com.demo.entity.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleDao {

    /**
     * 查询角色
     *
     * @return
     */
    @Select("select * from role")
    public List<Role> selectRole();


    /**
     * 根据Id删除角色
     */
    @Delete("delete from role where rid = #{rid} ")
    public Integer deleteRoleByRid(Integer rid);

    /**
     * 添加角色
     */
    @Insert("INSERT INTO role(Rname,oprSys,oprUser,oprNews,oprComment) VALUES (#{rname}, #{oprSys},#{oprUser},#{oprNews},#{oprComment})")
    public Integer insertRole(Role role);


    /**
     * 根据Id查询角色
     */
    @Select("select * from role where rid = #{rid}")
    public Role selectRoleById(Integer rid);
}
