package com.demo.controller;

import com.demo.entity.Sort;
import com.demo.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色控制层
 */
@Controller
public class SortController {

    @Autowired
    private SortService sortService;

    /**
     * 显示所有类别 返回json数据
     */
    @RequestMapping("/sys/sort/loadSort.action")
    @ResponseBody
    public List<Sort> findSort() {
        List<Sort> sortList = sortService.findAllSort();
        return sortList;
    }

    /**
     * 类别删除功能
     */
    @RequestMapping(value = "/sys/sort/delete.action", method = RequestMethod.POST)
    @ResponseBody
    public String deleteSort(Integer[] ids) {
        for (Integer id : ids) {
            Integer integer = sortService.deleteSortById(id);
            if (integer < 1) {
                return "FAIL";
            }
        }
        return "OK";
    }

    /**
     * 添加类别
     */
    @RequestMapping(value = "/sys/sort/create.action", method = RequestMethod.POST)
    @ResponseBody
    public String createSort(Sort sort) {
        Integer integer = sortService.insertSort(sort);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 显示所有类别 返回json数据
     */
    @RequestMapping("/loadSort.action")
    @ResponseBody
    public List<Sort> loadSort() {
        List<Sort> sortList = sortService.findAllSort();
        return sortList;
    }

}
