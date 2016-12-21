package com.yagu.exceptions;//package com.yagu.exceptions;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 未捕获异常处理界面
 *
 * @author tianshi
 * @time 2016/9/26 16:58
 */
@ControllerAdvice
@Service
public class Exceptions {
    /**
     * 空指针异常
     *
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public ModelAndView NullPointerException() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        return mv;

    }

    /**
     * Exception异常
     *
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(HttpServletRequest request, Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        return mv;
    }

    /**
     * 类型转换错误
     *
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler(ClassCastException.class)
    public ModelAndView handleClassCastException(HttpServletRequest request, ClassCastException ex) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        return mv;
    }
}
