package com.demo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 重命名工具
 */
public class NameUtils {
    /**
     * 头像重命名
     */
    public String NewPhotoName(Integer uid) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssMM");
        return String.format("%04d", uid) + "_" + sdf.format(date);
    }
}
