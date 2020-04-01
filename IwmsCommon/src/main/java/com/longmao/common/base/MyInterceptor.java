package com.longmao.common.base;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通用请求拦截配置
 */

@Component
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 视图渲染之后的操作
     */
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {

    }

    /**
     * 处理请求完成后视图渲染之前的处理操作
     */
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
    }

    /**
     * 进入controller层之前拦截请求
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
//        System.out.println("getContextPath:" + request.getContextPath());
//        System.out.println("getServletPath:" + request.getServletPath());
//        System.out.println("getRequestURI:" + request.getRequestURI());
//        System.out.println("getRequestURL:" + request.getRequestURL());
//        System.out.println("getRealPath:" + request.getSession().getServletContext().getRealPath("image"));
        /**
         * 预处理options请求
         */
        if (HttpMethod.OPTIONS.toString().equals(request.getMethod())) {
            response.setStatus(HttpStatus.NO_CONTENT.value());
            return true;
        }
//        String signature = request.getHeader("signature");
//        if ("wwivan".equals(signature)) {
//        } else {
//            response.sendError(-1, "请求错误");
//            return false;
//        }
        return true;

    }

}