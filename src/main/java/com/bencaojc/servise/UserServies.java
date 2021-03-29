package com.bencaojc.servise;

import com.bencaojc.utils.HttpClientUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;

@Service
public class UserServies {


    public String intoMain(String post) throws IOException, URISyntaxException {

        if (null != post && post.indexOf("main.php")>0){
            String s = HttpClientUtils.get("http://172.16.10.246:89/main.php", null);
            //这里是读取第一次登陆时服务器返回的cookie，然后用一个全局变量cookie接收。因为是服务器往客户端发送cookie，所以名字是Set-Cookie

            System.out.println(s+3);
            return s;
        }

        return null;
    }



}
