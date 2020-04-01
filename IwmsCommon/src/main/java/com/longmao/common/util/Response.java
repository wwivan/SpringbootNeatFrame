package com.longmao.common.util;

/**
 * @Author: wwivan
 * @Date: 2020/4/1日9:52
 * @Description: 统一返回数据样式
 */
public class Response {
    public static final int SUCCESS = 0;

    private int code;
    private String message = "success";
    private Object data;

    public Response() {
    }

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Response success() {
        return new Response();
    }

    public static Response success(int code, String message) {
        return new Response(code, message);
    }

    public static Response success(Object result) {
        return new Response(0, "success", result);
    }

    public static Response failed() {
        return new Response(-1, "处理失败");
    }

    public static Response failed(int code) {
        return new Response(code, "处理失败");
    }

    public static Response failed(int code, String message) {
        return new Response(code, message);
    }

    public static Response failed(String message) {
        return new Response(-1, message);
    }
}
