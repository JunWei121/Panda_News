package com.demo.controller;

import com.demo.common.utils.DateTimeUtils;
import com.demo.entity.News;
import com.demo.entity.User;
import com.demo.pojo.NewsResult;
import com.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;


    @RequestMapping(value = "/sys/news/listNews.action", method = RequestMethod.GET)
    @ResponseBody
    public NewsResult listNews(News news) {
        if (news != null) {
            news.setPageIndex((news.getPageNumber() - 1) * news.getPageSize());
        }
        //当前页的数据
        List<News> listNews = newsService.findListNews(news);
        //所有数据数据量
        news.setPageIndex(null);
        news.setPageSize(null);
        List<News> listNewsNoLimit = newsService.findListNews(news);
        int total = listNewsNoLimit.size();
        NewsResult newsResult = new NewsResult();
        newsResult.setTotal(total);
        newsResult.setRows(listNews);
        return newsResult;
    }

    /**
     * 编辑新闻
     */
    @RequestMapping("/sys/news/edit.action")
    @ResponseBody
    public String editAdmin(News news) {
        System.out.println(news);
        Integer integer = newsService.editNews(news);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /*********************************前台*******************************************/

    /**
     * 根据nid查询新闻
     *
     * @param nid
     * @return
     */
    @RequestMapping("/news/details.action")
    @ResponseBody
    public News findOne(Integer nid) {
        News one = newsService.findOneByNid(nid);
        return one;
    }

    /**
     * 时事新闻 时间倒叙
     */
    @RequestMapping("/news/listLatest.action")
    @ResponseBody
    public List<News> listLatest(News news) {
        List<News> listNews = newsService.findListNews(news);
        return listNews;
    }

    /**
     * 个人中心 新闻列表
     */
    @RequestMapping("/news/listMyNews.action")
    @ResponseBody
    public List<News> listMyNews(News news, HttpSession session) {
        User u = (User) session.getAttribute("USER_SESSION");
        news.setUid(u.getUid());
        List<News> listNews = newsService.findListNews(news);
        return listNews;
    }

    /**
     * 个人中心删除新闻
     */
    @RequestMapping("/news/deleteOne.action")
    @ResponseBody
    public String deleteOne(Integer nid, HttpSession session) {
        User u = (User) session.getAttribute("USER_SESSION");
        Integer uid = newsService.findUid(nid);
        //如果新闻为当前登陆用户所属
        if (uid == u.getUid()) {
            Integer integer = newsService.deleteOne(nid);
            if (integer > 0) {
                return "OK";
            }
        }
        return "FAIL";
    }

    /**
     * 发布新闻
     */
    @RequestMapping("/news/releaseNews.action")
    @ResponseBody
    public String releaseNews(News news, HttpSession session) {
        User u = (User) session.getAttribute("USER_SESSION");
        if (u.getIsVerify() == 1) {
            String now = new DateTimeUtils().toDateTimeStr(new Date());
            news.setReleaseTime(now);
            news.setUid(u.getUid());
            Integer integer = newsService.addNews(news);
            if (integer > 0) {
                return "OK";
            }
        }
        return "FAIL";
    }

    /**
     * 编辑新闻
     */
    @RequestMapping("/news/edit.action")
    @ResponseBody
    public String edit(News news, HttpSession session) {
        User u = (User) session.getAttribute("USER_SESSION");
        Integer uid = newsService.findUid(news.getNid());
        //如果新闻为当前登陆用户所属
        if (uid == u.getUid()) {
            Integer integer = newsService.editNews(news);
            if (integer > 0) {
                return "OK";
            }
        }
        return "FAIL";
    }
}
