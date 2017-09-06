package com.bbq.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by System-2 on 2/7/2017.
 */
public class DateFormatter {
        public static String format(String value, String format){
            Calendar cal = Calendar.getInstance();
            try {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
                cal.setTime(dateFormatter.parse(value));// all done
                dateFormatter = new SimpleDateFormat(format, Locale.ENGLISH);
                return dateFormatter.format(cal.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return value;
        }
        public static Calendar getCalFromTime(String value){
            Calendar cal = Calendar.getInstance();
            try {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
                cal.setTime(dateFormatter.parse(value));// all done
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return cal;
        }
}

