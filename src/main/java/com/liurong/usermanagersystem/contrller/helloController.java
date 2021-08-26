package com.liurong.usermanagersystem.contrller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class helloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    //查处一些数据在页面中展示
    @RequestMapping("/succese")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        //classpath:/templates/success
        return "success";
    }

}
