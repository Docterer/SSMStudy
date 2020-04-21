package com.test.resolver;

import com.test.exception.SysException;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver{

    /**
     * 处理异常处理逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Nullable
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @Nullable Object o, Exception e) {
        //获取到异常对象
        SysException se = null;
        if(e instanceof SysException){
            se=(SysException)se;
        }else{
            se = new SysException("");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",se.getMessage());
        mv.setViewName("404");
        return mv;
    }
}
