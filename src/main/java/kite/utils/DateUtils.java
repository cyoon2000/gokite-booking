package kite.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static int toDateNumber(int year, int month, int day) {
        return day + 100 * month + 10_000 * year;
    }

    public static int toDateNumber(long unixTime) {
        Date d = new Date(unixTime);
        String s = new SimpleDateFormat("yyyyMMdd").format(d);
        return Integer.parseInt(s);
    }

}
