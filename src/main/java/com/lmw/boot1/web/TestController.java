package com.lmw.boot1.web;

import com.lmw.boot1.exception.BusinessException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    /*@Value("${app.msg}")  //将属性中的常量注入给属性msg
    public String msg;*/

    @GetMapping("/")
    public String test() {
    if(true){
        throw new BusinessException();
    }
    return "index";
    }
}
