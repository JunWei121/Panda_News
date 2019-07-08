package com.demo.dao;

import com.demo.entity.Verify;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface VerifyDao {


    /**
     * 按条件查询所有认证请求
     */
    public List<Verify> selectListVerify(Verify verify);

    /**
     * 处理认证申请
     */
    @Update("update verify set isDeal = 0 where vid = #{vid}")
    public Integer updateIsDeal(Integer vid);

    /**
     * 查找uid
     */
    @Select("select * from verify where vid = #{vid}")
    public Verify selectUidByVid(Integer vid);

    /**
     * 添加申请
     */
    @Insert("INSERT INTO `panda`.`verify`(`uid`, `vCreatetime`, `vContent`) VALUES (#{uid}, #{vCreatetime}, #{vContent})")
    public Integer insertVerify(Verify verify);
}