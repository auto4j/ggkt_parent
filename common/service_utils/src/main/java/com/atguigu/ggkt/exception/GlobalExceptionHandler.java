package com.atguigu.ggkt.exception;

import com.atguigu.ggkt.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lyf
 * @date 2022/8/20 - 14:38
 * 功能描述：
 **/
@ControllerAdvice //aop
public class GlobalExceptionHandler {

    //全局异常处理
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        System.out.println("全局。。。。");
        e.printStackTrace();
        return Result.fail(null).message("执行全局异常处理");
    }

    //ArithmeticException特定异常处理
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        System.out.println("特定异常。。。。");
        e.printStackTrace();
        return Result.fail(null).message("执行ArithmeticException异常处理");
    }

    //GgktException自定义异常处理
    @ExceptionHandler(GgktException.class)
    @ResponseBody
    public Result error(GgktException e){
        System.out.println("自定义异常。。。。");
        e.printStackTrace();
        return Result.fail(null).code(e.getCode()).message(e.getMsg());
    }




}
