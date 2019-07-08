package com.demo.service;

import com.demo.entity.News;

import java.util.List;

public interface NewsService {

    public List<News> findListNews(News news);

    public News findOneByNid(Integer nid);

    public Integer deleteOne(Integer nid);

    public Integer findUid(Integer nid);

    public Integer addNews(News news);

    public Integer editNews(News news);
}
