package com.zxy.sample.common;

public enum ResponseEnum {
    SUCCESS(1000, "成功"),
    ERROR(1001, "失败");

    private final Integer code;
    private final String msg;

    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}