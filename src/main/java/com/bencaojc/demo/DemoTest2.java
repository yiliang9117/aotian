package com.bencaojc.demo;

import com.bencaojc.utils.HttpClientUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoTest2 {




    public static void main(String[] args) throws IOException, URISyntaxException {

        String s = "{\"start\":2,\"end\":11,\"runmsg\":\"第2列,【 宋伟京--15989163957---客户编号203091 】客户已经存在\\n第3列,【 周蓉珍--15018565098---客户编号874133 】客户已经存在\\n\"}";
        getRepeatPhone(s);
    }



    public static String getRepeatPhone(String jsonStr){
        HashMap<String, String> repeatPhones = new HashMap<>();
        Pattern allStrP =Pattern.compile("(【.*?】)");
        Matcher allStrM=allStrP.matcher(jsonStr);
        while(allStrM.find()) {
            String allStr = allStrM.group();
            String replace = allStr.replace("【 ", "").replace(" 】", "");
            String[] split = replace.split("--");
            repeatPhones.put(split[0],split[1]);
        }

        StringBuffer repeatPhoneStr = new StringBuffer();

        for(String key:repeatPhones.keySet()){
            String repeatPhone = key + ":" + repeatPhones.get(key)+"\n";
            repeatPhoneStr.append(repeatPhone);
        }


        return repeatPhoneStr.toString();
    }







}
