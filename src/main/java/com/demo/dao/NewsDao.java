package com.demo.dao;

import com.demo.entity.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface NewsDao {


    /**
     * 按条件查询新闻列表
     */
    public List<News> selectListNews(News news);

    /**
     * 根据id查询新闻
     */
    @Select("SELECT n.* , u.uname ,s.sortname FROM news n LEFT JOIN user u ON n.uid = u.uid " +
            "LEFT JOIN sort s ON n.sortId =s.sortId where nid = #{nid}")
    public News selectByNid(Integer nid);

    /**
     * 根据id删除新闻
     */
    @Delete("delete from news where nid = #{nid}")
    public Integer deleteOne(Integer nid);

    /**
     * 根据新闻查询 用户id
     */
    @Select("select uid from news where nid = #{nid} ")
    public Integer selectUid(Integer nid);

    /**
     * 添加新闻
     */
    @Insert("INSERT INTO `panda`.`news`(`Title`, `UId`, `ReleaseTime`, `NContent`, `sortId`, `cover`) " +
            "VALUES (#{title}, #{uid}, #{releaseTime}, #{nContent}, #{sortId}, #{cover})")
    public Integer insertNews(News news);

    /**
     * 编辑新闻
     */
    @Update("UPDATE news SET `Title` = #{title}, `NContent` = #{nContent}, `sortId` = #{sortId}, `cover` = #{cover} WHERE `NId` = #{nid}")
    public Integer updateNews(News news);
}
