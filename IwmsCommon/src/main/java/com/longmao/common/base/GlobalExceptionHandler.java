package com.longmao.common.base;

import com.alibaba.fastjson.JSONException;
import com.longmao.common.util.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e) throws JSONException {
        String message = e.getMessage();
        if(message==null||message.equals("")){
            message = "服务器出错";
        }
        return Response.failed(-1,message);
    }
}
