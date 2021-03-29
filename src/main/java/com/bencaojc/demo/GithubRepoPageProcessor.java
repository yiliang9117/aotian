package com.bencaojc.demo;

import com.bencaojc.utils.HttpClientUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GithubRepoPageProcessor {


    public static void main(String[] args) throws IOException, URISyntaxException {



        HttpClientUtils httpClientUtils = new HttpClientUtils();
        Map<String, String> prams = new HashMap<>();
        prams.put("user","王宜亮");
        prams.put("pass","123");

        String urlStr = "http://172.16.10.246:89/login.php";
        String post = httpClientUtils.postGotCook(urlStr ,prams );

        System.out.println(1+post);

        Map<String, String> cooks;







    }




}
