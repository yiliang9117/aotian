package com.bencaojc.demo;

import com.bencaojc.utils.HttpClientUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GithubRepoPageProcessor {




    public static void main(String[] args) throws IOException, URISyntaxException {



        HttpClientUtils httpClientUtils = new HttpClientUtils();
        Map<String, String> prams = new HashMap<>();
        prams.put("user","王宜亮");
        prams.put("pass","123");

        String urlStr = "http://172.16.10.246:89/login.php";
        String postCookoe = httpClientUtils.postGotCook(urlStr ,prams );

        System.out.println(1+postCookoe);
        gotoMainPage(postCookoe);

    }

    private static void gotoMainPage(String postCookoe) {

       /* HttpClientUtils httpClientUtils = new HttpClientUtils();
        httpClientUtils.getWithCookie(postCookoe);*/



        Map<String,String> cookie = new HashMap<>();

        String[] split = postCookoe.split("=");
        if (null != split){
            cookie.put(split[0] , split[1]);
        }

        String url = "http://172.16.10.246:89/main.php";
        System.out.println("获取的：" + cookie);
        doGet(url , cookie);





    }

    /**
     * HTTP GET请求 带 cookie
     * @param url 请求地址
     * @return 响应字符串
     */
    public static String doGet(String url,Map<String,String> cookie) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        String result = "";
        try {
            // 通过址默认配置创建一个httpClient实例
            httpClient = HttpClients.createDefault();
            // 创建httpGet远程连接实例
            HttpGet httpGet = new HttpGet(url);
            // 设置请求头信息，鉴权
            httpGet.setHeader("Authorization", "Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0");
            StringBuffer cookieStr = new StringBuffer();
            Iterator<Map.Entry<String,String>> iterator = cookie.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String,String> next = iterator.next();
                cookieStr.append(next.getKey()).append("=").append(next.getValue()).append(";");
            }
            if(cookieStr.length() > 0) {
                cookieStr.setLength(cookieStr.length() - 1);
            }
            // cookie字符串的格式：key=value; Expires=date(或Max-Age=毫秒数); Path=path; Domain=domain; Secure; HttpOnly
            httpGet.addHeader("Cookie", cookieStr.toString());
            // 设置配置请求参数
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(35000)// 连接主机服务超时时间
                    .setConnectionRequestTimeout(35000)// 请求超时时间
                    .setSocketTimeout(60000)// 数据读取超时时间
                    .build();
            // 为httpGet实例设置配置
            httpGet.setConfig(requestConfig);
            // 执行get请求得到返回对象
            response = httpClient.execute(httpGet);
            // 通过返回对象获取返回数据
            HttpEntity entity = response.getEntity();
            // 通过EntityUtils中的toString方法将结果转换为字符串
            result = EntityUtils.toString(entity);

            System.out.println( "页面：" + result);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }










}
