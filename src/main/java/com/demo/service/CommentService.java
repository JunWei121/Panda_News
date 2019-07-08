package com.demo.service;

import com.demo.entity.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> findListComment(Comment comment);

    public Integer deleteByCid(Integer cid);

    public Integer findUid(Integer cid);

    public Integer addComment(Comment comment);
}
