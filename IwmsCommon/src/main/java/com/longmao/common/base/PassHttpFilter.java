package com.longmao.common.base;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebFilter(urlPatterns = "/*", filterName = "authFilter")  //这里的“/*” 表示的是需要拦截的请求路径
public class PassHttpFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    /**
     * 跨域处理
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse)servletResponse;
        httpResponse.setHeader("Access-Control-Allow-Headers","*");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.addHeader("Access-Control-Allow-Origin", "*");
//        HttpServletRequest reqs = (HttpServletRequest) servletRequest;
//        httpResponse.setHeader("Access-Control-Allow-Origin",reqs.getHeader("Origin"));
//        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
//        httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//        httpResponse.setHeader("Access-Control-Max-Age", "3600");
//        httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type");

        filterChain.doFilter(servletRequest, httpResponse);
    }

    @Override
    public void destroy() {
    }
}