package com.chinasofti.mergerequestverify.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期
 *
 * @author Li Shijie
 * @since 1.0.0
 */
public class DateUtils {
    public static int getDays(Date start, Date end) {
        return (int) ((end.getTime() - start.getTime()) / 1000 / 60 / 60 / 24);
    }

    /*
    * 隔天返1
    * 时间任意顺序
    * */
    public static int getDaysByFormat(Date start, Date end) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getDateTimeInstance();
        try {
            start = simpleDateFormat.parse(simpleDateFormat.format(start).split(" ")[0] + " 00:00:00");
            end = simpleDateFormat.parse(simpleDateFormat.format(end).split(" ")[0] + " 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
            return Math.abs(getDays(start,end));
        }
        return (int) Math.abs((end.getTime() - start.getTime()) / 1000 / 60 / 60 / 24);
    }

    public static void main(String[] args) {
//        Date start = new Date();
//        Date end = new Date();
//        start.setHours(23);
//        end.setHours(1);
//        end.setDate(start.getDate()+1);
//        System.out.println(start.toLocaleString());
//        System.out.println(end.toLocaleString());
//        System.out.println(getDays(start,end));
//        System.out.println(getDaysByFormat(end,start));
    }
}
