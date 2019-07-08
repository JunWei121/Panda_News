package com.demo.dao;

import com.demo.entity.Sort;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SortDao {

    /**
     * 查询类别
     *
     * @return
     */
    @Select("select * from sort")
    public List<Sort> selectSort();


    /**
     * 根据Id删除类别
     */
    @Delete("delete from sort where sortId = #{sortId} ")
    public Integer deleteSortById(Integer sortId);

    /**
     * 添加类别
     */
    @Insert("INSERT INTO sort(SortName) VALUES (#{sortName})")
    public Integer insertSort(Sort sort);
}
