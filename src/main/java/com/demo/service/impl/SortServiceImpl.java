package com.demo.service.impl;

import com.demo.dao.SortDao;
import com.demo.entity.Sort;
import com.demo.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 新闻类别业务类
 */
@Transactional
@Service("sortService")
public class SortServiceImpl implements SortService {

    @Autowired
    private SortDao sortDao;

    /**
     * 查询所有类别
     *
     * @return
     */
    @Override
    public List<Sort> findAllSort() {
        List<Sort> sortList = sortDao.selectSort();
        return sortList;
    }

    /**
     * 按ID删除类别
     *
     * @param sortId
     * @return
     */
    @Override
    public Integer deleteSortById(Integer sortId) {
        Integer integer = sortDao.deleteSortById(sortId);
        return integer;
    }

    /**
     * 插入类别
     *
     * @param sort
     * @return
     */
    @Override
    public Integer insertSort(Sort sort) {
        Integer integer = sortDao.insertSort(sort);
        return integer;
    }
}
