package com.lmw.boot1.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyContorllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public String errorHandler(Exception e){
        return "error500";
    }

    /*@ExceptionHandler(value = BusinessException.class)
    public Map<String,Object>errorHandler(BusinessException e){
        Map<String,Object> map=new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg",e.getMsg());
        return map;
    }*/
}
