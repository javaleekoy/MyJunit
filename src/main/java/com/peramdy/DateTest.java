package com.peramdy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by Peramdy on 2016/12/10.
 */
public class DateTest {

    /**
     * @param time
     * @return
     * @Description time format 24H
     */
    public static String test24H(Date time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(time);
    }

    /**
     * @param time
     * @return
     * @Description time format 12H
     */
    public static String test12H(Date time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(time);
    }


    public static String getAddDay(int day){
        Date date = new Date();
        System.out.println((new SimpleDateFormat("yyyy-MM-dd")).format(date));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, day);
        System.out.println((new SimpleDateFormat("yyyy-MM-dd")).format(cal.getTime()));

        return (new SimpleDateFormat("yyyy-MM-dd")).format(cal.getTime());
    }


}
