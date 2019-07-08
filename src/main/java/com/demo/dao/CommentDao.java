package com.demo.dao;

import com.demo.entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentDao {


    /**
     * 按条件查询评论列表
     */
    public List<Comment> selectListComments(Comment comment);

    /**
     * 根据id删除评论
     */
    @Delete("delete from comment where cid = #{cid}")
    public Integer deleteByCid(Integer cid);


    /**
     * 根据评论查询 用户id
     */
    @Select("select uid from comment where cid = #{cid} ")
    public Integer selectUid(Integer cid);

    /**
     * 发表评论
     */
    @Insert("INSERT INTO `panda`.`comment`(`Ccontent`, `Nid`, `Uid`) " +
            "VALUES (#{cContent}, #{nid}, #{uid})")
    public Integer insertComment(Comment comment);
}
