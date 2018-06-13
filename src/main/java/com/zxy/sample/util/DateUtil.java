package com.zxy.sample.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateUtil {
    private static final ThreadLocal<SimpleDateFormat> df = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static String format(Instant date) {
        return df.get().format(date);
    }

    public static Date parse(String dateStr) throws Exception {
        return df.get().parse(dateStr);
    }
}
