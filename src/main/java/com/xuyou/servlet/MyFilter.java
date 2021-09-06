package com.xuyou.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.xml.ws.WebFault;
import java.io.IOException;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-08-12 11:57
 **/
@WebFilter(filterName = "myFilter",urlPatterns = "/*")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器执行");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
