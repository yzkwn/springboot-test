package com.test.springboot.springboottest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test {


    @Value("${boot.name}")
    private String name;

    @Value("${boot.age}")
    private  String age;

    @RequestMapping("/test")
    public  String c(){
        return name+"------"+age;
    }


    /*只支持get请求，相当于：@RequestMappring+RequestMethod.Get  */
    @GetMapping("boot/getUser")
    public Object Get(){
        return "zhangsan";
    }
}
