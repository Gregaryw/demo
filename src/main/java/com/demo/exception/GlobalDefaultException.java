package com.demo.exception;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理类
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/10
 */
@RestControllerAdvice
public class GlobalDefaultException {
    private static Logger logger = LoggerFactory.getLogger(GlobalDefaultException.class);
    private static final JSONObject jsonObject = new JSONObject();

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String defaultExceptionHandler(HttpServletRequest req, Exception e){
        logger.error("全局参数出现异常{}",e);
        jsonObject.put("code",-1);
        jsonObject.put("msg","系统繁忙，请稍后重试!");
        return jsonObject.toJSONString();
    }
}
