package com.zxy.sample.util;

import com.zxy.sample.common.ResponseEnum;
import com.zxy.sample.bean.ResponseResult;

public class ResponseResultUtil {

    /**
     * 响应成功数据
     *
     * @param object
     * @return
     */
    public static ResponseResult success(Object object) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(ResponseEnum.SUCCESS.getCode());
        responseResult.setMsg(ResponseEnum.SUCCESS.getMsg());
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
    public static ResponseResult error(Integer code, String msg) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        return responseResult;
    }
}
