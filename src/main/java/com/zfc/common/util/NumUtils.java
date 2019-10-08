package com.zfc.common.util;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

/**
 * @Author zufeichao
 * @ProjectName
 * @Description TODO
 * @Date 2019-09-09 18:18
 * @T: NumUtils
 **/
public class NumUtils {

    private static int Guid = 0;

    private static Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+");

    public static boolean isNum(String str){

        Pattern pattern = NUMBER_PATTERN;
        if(pattern.matcher(str).matches()){
            //数字
            return true;
        } else {
            //非数字
            return false;
        }
    }

    public static Long parseLong(String str){
        if(StringUtils.isBlank(str)){
            return null;
        }
        return Long.parseLong(str);
    }

    public static String getNumberId() {
        ++Guid;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime ldt = LocalDateTime.now();
        String time = dateFormat.format(ldt);

        if (Guid > 99999) {
            Guid = 10000;
        }
        int ran = Guid;
        return time +String.format("%05d",ran);
    }

    public static void main(String[] args) {
        System.out.print(getNumberId());
    }
}
