package com.demo.service.impl;

import com.demo.dao.CommentDao;
import com.demo.entity.Comment;
import com.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 评论业务层
 */
@Transactional
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    /**
     * 按条件查询评论
     *
     * @param comment
     * @return
     */
    @Override
    public List<Comment> findListComment(Comment comment) {
        List<Comment> commentList = commentDao.selectListComments(comment);
        return commentList;
    }

    /**
     * 根据id删除评论
     *
     * @param cid
     * @return
     */
    @Override
    public Integer deleteByCid(Integer cid) {
        Integer integer = commentDao.deleteByCid(cid);
        return integer;
    }

    /**
     * 查询发表评论的用户id
     * @param cid
     * @return
     */
    @Override
    public Integer findUid(Integer cid) {
        Integer uid = commentDao.selectUid(cid);
        return uid;
    }

    /**
     * 发表评论
     *
     * @param comment
     * @return
     */
    @Override
    public Integer addComment(Comment comment) {
        Integer integer = commentDao.insertComment(comment);
        return integer;
    }
}
