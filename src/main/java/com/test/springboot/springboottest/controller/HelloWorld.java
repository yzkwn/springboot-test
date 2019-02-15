package com.test.springboot.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*当propertise文件和yml文件共存的时候。优先选择propertise文件*/


@Controller
public class HelloWorld {
    @RequestMapping("/HelloWorld")
    public @ResponseBody String index(){
        return "hello spring boot";
    }
}
