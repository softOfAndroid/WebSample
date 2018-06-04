package com.zxy.sample.common;

public enum ResponseCode {
    SUCCESS("0000", "成功"),
    ERROR("0001", "失败");

    private final String code;
    private final String msg;

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
