package com.bencaojc.controller;

import com.bencaojc.servise.UserServies;
import com.bencaojc.utils.HttpClientUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class QuickStartController {


    UserServies userServies =new UserServies();


    @RequestMapping("/quick")
    @ResponseBody
    public String quick() throws IOException, URISyntaxException {

        HttpClientUtils httpClientUtils = new HttpClientUtils();
        Map<String, String> prams = new HashMap<>();
        prams.put("user","王宜亮");
        prams.put("pass","123");

        String urlStr = "http://172.16.10.246:89/login.php";
        String post = httpClientUtils.post(urlStr ,prams );
        String s = userServies.intoMain(post);
        System.out.println(s+2);
        System.out.println(1+post);

        

        return "springboot 访问成功!"+post;
    }
}
