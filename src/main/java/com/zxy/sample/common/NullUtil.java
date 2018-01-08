package com.zxy.sample.common;

public class NullUtil {

    /**
     * 判断字符串是否为空
     * @param message
     * @param target
     * @return
     */
    public static String throwIfBlank(String message, String target){
        if (target == null || target.trim().length() == 0){
            throw new ExceptionUtil(message);
        }
        return target;
    }

    public static String $(String message, String target){
        return throwIfBlank(message,target);
    }
}
