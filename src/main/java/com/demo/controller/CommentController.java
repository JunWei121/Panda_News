package com.demo.controller;

import com.demo.entity.Comment;
import com.demo.entity.User;
import com.demo.pojo.CommentResult;
import com.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;


    @RequestMapping(value = "/sys/comment/listComment.action", method = RequestMethod.GET)
    @ResponseBody
    public CommentResult listCOmment(Comment comment) {
        if (comment != null) {
            comment.setPageIndex((comment.getPageNumber() - 1) * comment.getPageSize());
        }
        //当前页的数据
        List<Comment> listComment = commentService.findListComment(comment);
        //所有数据数据量
        comment.setPageIndex(null);
        comment.setPageSize(null);
        List<Comment> listCommentNoLimit = commentService.findListComment(comment);
        int total = listCommentNoLimit.size();
        CommentResult commentResult = new CommentResult();
        commentResult.setTotal(total);
        commentResult.setRows(listComment);
        return commentResult;
    }

    /**
     * 根据id 删除评论控制器
     */
    @RequestMapping("/sys/comment/delete.action")
    @ResponseBody
    public String deleteByCid(Integer cid) {
        Integer integer = commentService.deleteByCid(cid);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 根据nid显示评论
     */
    @RequestMapping("/news/comments.action")
    @ResponseBody
    public List<Comment> listComments(Comment comment) {
        List<Comment> listComment = commentService.findListComment(comment);
        return listComment;
    }

    /**
     * 发表评论
     */
    @RequestMapping("/news/addComment.action")
    @ResponseBody
    public String addComment(Comment comment, HttpSession session) {
        User user = (User) session.getAttribute("USER_SESSION");
        comment.setUid(user.getUid());
        Integer integer = commentService.addComment(comment);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 显示个人中心评论
     */
    @RequestMapping("/news/listMycomments.action")
    @ResponseBody
    public List<Comment> listComments(Comment comment, HttpSession session) {
        User u = (User) session.getAttribute("USER_SESSION");
        comment.setUid(u.getUid());
        List<Comment> listComment = commentService.findListComment(comment);
        return listComment;
    }

    /**
     * 个人中心删除评论
     */
    @RequestMapping("/comment/deleteOne.action")
    @ResponseBody
    public String deleteOne(Integer cid, HttpSession session) {
        User u = (User) session.getAttribute("USER_SESSION");
        Integer uid = commentService.findUid(cid);
        //如果评论为当前登陆用户所属
        if (uid == u.getUid()) {
            Integer integer = commentService.deleteByCid(cid);
            if (integer > 0) {
                return "OK";
            }
        }
        return "FAIL";
    }
}
