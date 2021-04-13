package com.bencaojc.servise;

import com.bencaojc.utils.HttpClientUtils;
import com.bencaojc.utils.HttpUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServies {






    /*
    * 登录并获取初次Cookie
    *
    * */
    public String doLogin(String urlStr, Map<String, String> prams) throws IOException, URISyntaxException {
      String cookie = HttpClientUtils.doPostGetCookie(urlStr ,prams );
      if (null != cookie)
         return cookie;
      else return null;
    }


    /*
    * 携带Cookie用get访问页面
    *
    * */
    public String toPageWiteCookie(String mainUrl, String cookieStr) {

        Map<String,String> cookie = new HashMap<>();
        String[] split = cookieStr.split("=");
        if (null != split){
            cookie.put(split[0] , split[1]);
        }
        return HttpUtils.doGetWithCookis(mainUrl, cookie);

    }
}
