package com.zxy.sample.common;

public class ExceptionUtil extends RuntimeException{

    public ExceptionUtil(String message) {
        super(message);
    }

    public ExceptionUtil(String message, Throwable cause) {
        super(message, cause);
    }
}
