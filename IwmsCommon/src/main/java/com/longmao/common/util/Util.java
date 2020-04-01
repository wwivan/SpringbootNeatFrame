package com.longmao.common.util;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: wwivan
 * @Date: 2020/4/1日9:52
 * @Description: 常用工具类
 */
public class Util {
    /**
     * 为文件重新命名，命名规则为当前系统时间毫秒数
     *
     * @return string
     */
    public static String getFileNameNew() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return fmt.format(new Date());
    }

    /**
     * 以当前日期为名，创建新文件夹
     *
     * @return
     */
    public static String createNewDir() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        return fmt.format(new Date());
    }

    public static boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        String s2 = "^[1](([3][0-9])|([4][5,7,9])|([5][0-9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$";// 验证手机号
        if (StringUtils.isNotBlank(str)) {
            p = Pattern.compile(s2);
            m = p.matcher(str);
            b = m.matches();
        }
        return b;
    }

}
