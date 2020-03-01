package com.mmall.exception;

import com.mmall.common.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName RExceptionHandler
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/1 13:36
 */
@ControllerAdvice
public class RExceptionHandler {
    @ExceptionHandler(RException.class)
    @ResponseBody
    public R rExp(RException rException){
        R r = new R();
        r.put("code",500);
        r.put("msg",rException.getMsg());
        return r;
    }
    //统一异常处理机制，
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R allExp(Exception exception){
        R r = new R();
        r.put("code",500);
        r.put("msg","系统内部异常，请联系管理员");
        return r;
    }

}