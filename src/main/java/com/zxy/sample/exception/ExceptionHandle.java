package com.zxy.sample.exception;

import com.zxy.sample.entry.ResponseResult;
import com.zxy.sample.util.ResponseResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler
    @ResponseBody
    public ResponseResult handle(Exception e) {
        if (e instanceof CustomException) {
            CustomException exceptionUtil = (CustomException) e;
            return ResponseResultUtil.error(exceptionUtil.getCode(), exceptionUtil.getMessage());
        }
        return ResponseResultUtil.error(0, e.getMessage());
    }
}
