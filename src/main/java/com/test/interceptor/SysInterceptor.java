package com.test.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 * springMVC的拦截器，用于对处理器进行预处理，拦截器类似过滤器，但是和过滤器不同
 * 过滤器可以过滤所有访问资源，拦截器只会拦截拦截访问控制器的方法
 * 过滤器都可以使用，拦截器只能springMVC使用
 */
public class SysInterceptor implements HandlerInterceptor{

    //IDEA 实现类方法的快捷键 command+o

    /**
     * 预处理，在controller方法执行之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }

    /**
     * 后处理，在controller方法执行完之后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    /**
     * 最后执行的方法，当页面执行完，再执行，可用于释放资源
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
