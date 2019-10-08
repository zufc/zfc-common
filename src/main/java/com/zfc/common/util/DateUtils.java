package com.zfc.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author zufeichao
 * @ProjectName zfc-common
 * @Description TODO
 * @Date 2019-10-08 15:04
 * @T: DateUtil
 **/
public class DateUtils {

    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String LocalDateTimeToString(LocalDateTime localDateTime){

        if(localDateTime == null){
            return  null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);
        String format = localDateTime.format(formatter);
        return format;

    }

    /**
     * String转LocalDateTime
     * @param time
     * @return
     */
    public static LocalDateTime formatDate(String time) {
        if (time == null) {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);
        return LocalDateTime.parse(time, dateTimeFormatter);
    }
}
