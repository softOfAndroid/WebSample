package com.zxy.sample.util;

import com.zxy.sample.common.ResponseCode;
import com.zxy.sample.entry.ResponseResult;

public class ResponseResultUtil {

    /**
     * 响应成功数据
     *
     * @param object
     * @return
     */
    public static ResponseResult success(Object object) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(ResponseCode.SUCCESS.getCode());
        responseResult.setMsg(ResponseCode.SUCCESS.getMsg());
        responseResult.setData(object);
        return responseResult;
    }

    /**
     * 响应错误信息
     *
     * @param code
     * @param msg
     * @return
     */
    public static ResponseResult error(String code, String msg) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        return responseResult;
    }
}
