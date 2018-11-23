package com.shilei.springbootdemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "BaseFilter",urlPatterns = "/*")
public class BaseFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException,IOException{
        //HttpServletRequest extends ServletRequest 都是接口
        HttpServletRequest r=(HttpServletRequest)request;
        String username=r.getParameter("username");
        String password=r.getParameter("password");
        System.out.println(username+password);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
