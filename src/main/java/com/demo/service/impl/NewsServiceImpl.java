package com.demo.service.impl;

import com.demo.dao.NewsDao;
import com.demo.entity.News;
import com.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> findListNews(News news) {
        List<News> newsList = newsDao.selectListNews(news);
        return newsList;
    }

    /**
     * 根据id查询新闻
     *
     * @param nid
     * @return
     */
    @Override
    public News findOneByNid(Integer nid) {
        News news = newsDao.selectByNid(nid);
        return news;
    }

    /**
     * 根据id删除新闻
     *
     * @param nid
     * @return
     */
    @Override
    public Integer deleteOne(Integer nid) {
        Integer integer = newsDao.deleteOne(nid);
        return integer;
    }

    /**
     * 查询所属用户id
     *
     * @param nid
     * @return
     */
    @Override
    public Integer findUid(Integer nid) {
        Integer uid = newsDao.selectUid(nid);
        return uid;
    }

    /**
     * 添加新闻
     * @param news
     * @return
     */
    @Override
    public Integer addNews(News news) {
        Integer integer = newsDao.insertNews(news);
        return integer;
    }

    /**
     * 编辑新闻
     * @param news
     * @return
     */
    @Override
    public Integer editNews(News news) {
        Integer integer = newsDao.updateNews(news);
        return integer;
    }
}
