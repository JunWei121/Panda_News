package com.demo.service;


import com.demo.entity.Sort;

import java.util.List;

public interface SortService {

    public List<Sort> findAllSort();

    public Integer deleteSortById(Integer sortId);

    public Integer insertSort(Sort sort);
}
