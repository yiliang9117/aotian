package com.bencaojc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }


    @RequestMapping("hello2")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功!";
    }

    @ResponseBody
    public String quick2(){
        return "springboot 访问成功!";
    }
}
