package com.bencaojc.controller;

import com.bencaojc.servise.UserServies;
import com.bencaojc.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Controller
public class QuickStartController {



    @Autowired
    UserServies userServies;




    @RequestMapping("/quick")
    @ResponseBody
    public String quick() throws IOException, URISyntaxException {

        Map<String, String> prams = new HashMap<>();
        prams.put("user","王宜亮");
        prams.put("pass","123");

        String urlStr = "http://172.16.10.246:89/login.php";
        String mainUrl = "http://172.16.10.246:89/module/importXls/impworkguest.php";




        String cookie = userServies.doLogin(urlStr , prams);
        System.out.println(cookie);
        String html = userServies.toPageWiteCookie(mainUrl, cookie);

        //http://172.16.10.246:89/

        String excelPath = "D:\\soft\\develop\\aotian\\src\\main\\resources\\13\\16.xls";


        Map<String, String> upfilePrams = new HashMap<>();
        prams.put("action","upfile");
        prams.put("elid","file_add");
        prams.put("istest","1");


        String postUrl = "http://172.16.10.246:89/module/importXls/impworkguest_ajax.php";

        HttpClientUtils.uploadFile( excelPath,cookie);



        String postUrlhtml = HttpClientUtils.doPostGetCookie(postUrl,upfilePrams);


        System.out.println("上传文件：" + postUrlhtml);

        

        return "springboot 访问成功!"+html;
    }


}
