package com.demo.common.utils;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 日期时间工具类
 */
public class DateTimeUtils {

    /**
     * 返回sqlDateTime
     * @param date
     * @return
     */
    public String toDateTimeStr(Date date){
        Timestamp timeStamp = new Timestamp(date.getTime());
        return timeStamp.toString();
    }
}
