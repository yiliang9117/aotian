package com.bencaojc.utils;


import com.alibaba.fastjson.JSON;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class HttpClientUtils {

    public HttpClientUtils() {
    }

    /**
     * 连接超时时间
     */
    public static final int CONNECTION_TIMEOUT_MS = 5000;

    /**
     * 读取数据超时时间
     */
    public static final int SO_TIMEOUT_MS = 5000;


    public static final String utf8 = "UTF-8";

    public static final String application_json = "application/json";

    public static final String gbk = "GBK";

    /**
     * 简单get调用
     *
     * @param url
     * @param params
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String get(String url, Map<String, String> params)
            throws IOException, URISyntaxException {
        return get(url, params, utf8);
    }

    /**
     * 简单get调用
     *
     * @param url
     * @param params
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String get(String url, Map<String, String> params, String charset)
            throws IOException, URISyntaxException {
        HttpClient client = buildHttpClient(true);
        HttpGet get = buildHttpGet(url, params, charset);
        HttpResponse response = client.execute(get);
        assertStatus(response);


        HttpEntity entity = response.getEntity();
        if (entity != null) {
            return EntityUtils.toString(entity, charset);
        }
        return null;
    }


    public static String get(String url, Map<String, String> params, Map<String, String> headerMap, CookieStore cookieStore, HttpHost proxy, String charset)
            throws IOException, URISyntaxException {
        HttpClient client = buildHttpClient(true, cookieStore, proxy);
        HttpGet get = buildHttpGet(url, params, charset);
        seHttpHeader(get, headerMap);
        HttpResponse response = client.execute(get);
        assertStatus(response);

        HttpEntity entity = response.getEntity();
        if (entity != null) {
            return EntityUtils.toString(entity, charset);
        }
        return null;
    }

    /**
     * 简单post调用
     *
     * @return
     * @throws URISyntaxException
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String post(String url, Map<String, String> params)
            throws URISyntaxException, IOException {
        return post(url, params, utf8);
    }

    public static String postJSON(String url, Map<String, String> params) throws IOException, URISyntaxException {
        return postJSON(url, params, utf8);
    }

    /**
     * 简单post调用
     *
     * @param url
     * @param params
     * @return
     * @throws URISyntaxException
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String post(String url, Map<String, String> params, String charset)
            throws URISyntaxException, IOException {

        HttpClient client = buildHttpClient(true);
        HttpPost postMethod = buildHttpPost(url, params, charset);
        HttpResponse response = client.execute(postMethod);
        assertStatus(response);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            return EntityUtils.toString(entity, charset);
        }

        return null;
    }

/*
* 获取cookie信息
* */
    public static String doPostGetCookie(String url, Map<String, String> params)
            throws URISyntaxException, IOException {

        HttpClient client = buildHttpClient(true);
        HttpPost postMethod = buildHttpPost(url, params, utf8);

        HttpResponse response = client.execute(postMethod);
        System.out.println(response.toString());
        Header[] responseHeader = response.getHeaders("Set-Cookie");
        int length = responseHeader.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (responseHeader[i] != null) {
                if ("Set-Cookie".equals(responseHeader[i].getName())) {
                    int index = responseHeader[i].getValue().indexOf(";");
                    if (i == length - 1) {
                        stringBuilder.append(responseHeader[i].getValue().substring(0, index));
                    } else {
                        stringBuilder.append(responseHeader[i].getValue().substring(0, index) + "; ");
                    }
                }
            }
        }

        assertStatus(response);
        HttpEntity entity = response.getEntity();
        EntityUtils.toString(entity, utf8);

        if (entity != null) {

            return stringBuilder.toString();
        }

        return null;
    }


    /*
    * 上传文件
    * */
    public static String doPostUpfile(String url, Map<String, String> params)
            throws URISyntaxException, IOException {

        HttpClient client = buildHttpClient(true);
        HttpPost postMethod = buildHttpPost(url, params, utf8);

        HttpResponse response = client.execute(postMethod);
        System.out.println(545);
        Header[] responseHeader = response.getHeaders("Set-Cookie");
        int length = responseHeader.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (responseHeader[i] != null) {
                if ("Set-Cookie".equals(responseHeader[i].getName())) {
                    int index = responseHeader[i].getValue().indexOf(";");
                    if (i == length - 1) {
                        stringBuilder.append(responseHeader[i].getValue().substring(0, index));
                    } else {
                        stringBuilder.append(responseHeader[i].getValue().substring(0, index) + "; ");
                    }
                }
            }
        }

        assertStatus(response);
        HttpEntity entity = response.getEntity();
        EntityUtils.toString(entity, utf8);

        if (entity != null) {
            return stringBuilder.toString();
        }

        return null;
    }




    /*
    * 模拟表单上传文件
    * */
    public static String formPostUploadFile(String urlStr, Map<String, String> textMap,
                                    Map<String, String> fileMap) {
        String res = "";
        HttpURLConnection conn = null;
        String BOUNDARY = "---------------------------123821742118716"; //boundary就是request头和上传文件内容的分隔符
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(30000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn
                    .setRequestProperty("User-Agent",
                            "Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
            conn.setRequestProperty("Content-Type",
                    "multipart/form-data; boundary=" + BOUNDARY);
            OutputStream out = new DataOutputStream(conn.getOutputStream());
            // text
            if (textMap != null) {
                StringBuffer strBuf = new StringBuffer();
                Iterator iter = textMap.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry entry = (Map.Entry) iter.next();
                    String inputName = (String) entry.getKey();
                    String inputValue = (String) entry.getValue();
                    if (inputValue == null) {
                        continue;
                    }
                    strBuf.append("\r\n").append("--").append(BOUNDARY).append(
                            "\r\n");
                    strBuf.append("Content-Disposition: form-data; name=\""
                            + inputName + "\"\r\n\r\n");
                    strBuf.append(inputValue);
                }
                out.write(strBuf.toString().getBytes());
            }
            // file
            if (fileMap != null) {
                Iterator iter = fileMap.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry entry = (Map.Entry) iter.next();
                    String inputName = (String) entry.getKey();
                    String inputValue = (String) entry.getValue();
                    if (inputValue == null) {
                        continue;
                    }
                    File file = new File(inputValue);
                    String filename = file.getName();

                    StringBuffer strBuf = new StringBuffer();
                    strBuf.append("\r\n").append("--").append(BOUNDARY).append(
                            "\r\n");
                    strBuf.append("Content-Disposition: form-data; name=\""
                            + inputName + "\"; filename=\"" + filename
                            + "\"\r\n");
//                    strBuf.append("Content-Type:" + contentType + "\r\n\r\n");
                    strBuf.append("Content-Type:" + "multipart/form-data; boundary=----WebKitFormBoundary" + "\r\n\r\n");
                    out.write(strBuf.toString().getBytes());
                    DataInputStream in = new DataInputStream(
                            new FileInputStream(file));
                    int bytes = 0;
                    byte[] bufferOut = new byte[1024];
                    while ((bytes = in.read(bufferOut)) != -1) {
                        out.write(bufferOut, 0, bytes);
                    }
                    in.close();
                }
            }
            byte[] endData = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();
            out.write(endData);
            out.flush();
            out.close();
            // 读取返回数据
            StringBuffer strBuf = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                strBuf.append(line).append("\n");
            }
            res = strBuf.toString();
            reader.close();
            reader = null;
        } catch (Exception e) {
            System.out.println("发送POST请求出错。" + urlStr);
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
                conn = null;
            }
        }
        return res;
    }







    public static String uploadFile(String fileName,String cookieStr) {



        String excelPath = "D:\\soft\\develop\\aotian\\src\\main\\resources\\13\\16.xls";
        try {

            System.out.println("上传文件中：" + fileName);


            Map<String,String> cookie = new HashMap<>();
            String[] split = cookieStr.split("=");
            if (null != split){
                cookieStr = split[1];
            }

            // 换行符
            final String newLine = "\r\n";
            final String boundaryPrefix = "--";
            // 定义数据分隔线
            String BOUNDARY = "JkNfowlhTI2ZS4zN";
            // 服务器的域名
            URL url = new URL("http://172.16.10.246:89/module/importXls/impworkguest_ajax.php?action=upfile&elid=file_add&istest=1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 设置为POST情
            conn.setRequestMethod("POST");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求头参数
            conn.setRequestProperty("connection", "close");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundary" + BOUNDARY);
            conn.setRequestProperty("Cookie", cookieStr);


            OutputStream out = new DataOutputStream(conn.getOutputStream());

            // 上传文件
            File file = new File(excelPath);
            StringBuilder sb = new StringBuilder();
            sb.append(boundaryPrefix);
            sb.append(BOUNDARY);
            sb.append(newLine);
            // 文件参数,photo参数名可以随意修改
            /*sb.append("Content-Disposition: form-data;name=\"photo\";filename=\"" + fileName
                    + "\"" + newLine);*/
            sb.append("Content-Type:multipart/form-data;");
            // 参数头设置完以后需要两个换行，然后才是参数内容
            sb.append("fileElementId:'file_add' ");
            sb.append("dataType:'text' ");
            sb.append(newLine);

            // 将参数头的数据写入到输出流中
            out.write(sb.toString().getBytes());

            // 数据输入流,用于读取文件数据
            DataInputStream in = new DataInputStream(new FileInputStream(
                    file));
            byte[] bufferOut = new byte[1024];
            int bytes = 0;
            // 每次读1KB数据,并且将文件数据写入到输出流中
            while ((bytes = in.read(bufferOut)) != -1) {
                out.write(bufferOut, 0, bytes);
            }
            // 最后添加换行
            out.write(newLine.getBytes());
            in.close();

            // 定义最后数据分隔线，即--加上BOUNDARY再加上--。
            byte[] end_data = (newLine + boundaryPrefix + BOUNDARY + boundaryPrefix + newLine)
                    .getBytes();
            // 写上结尾标识
            out.write(end_data);
            out.flush();
            out.close();




            // 定义BufferedReader输入流来读取URL的响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                return line;
            }

        } catch (Exception e) {
            System.out.println("发送POST请求出现异常！" + e);
            e.printStackTrace();
        }
        return null;
    }














    public static String postJSON(String url, Map params, String charset)
            throws URISyntaxException, IOException {

        HttpClient client = buildHttpClient(true);
        HttpPost postMethod = buildHttpJSONPost(url, params, charset);
        HttpResponse response = client.execute(postMethod);
        assertStatus(response);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            return EntityUtils.toString(entity, charset);
        }

        return null;
    }

    /**
     * 创建HttpClient
     *
     * @param isMultiThread
     * @return
     */
    public static HttpClient buildHttpClient(boolean isMultiThread) {
        CloseableHttpClient client;
        if (isMultiThread)
            client = HttpClientBuilder
                    .create().setDefaultRequestConfig(buildRequestConfig(null))
                    .setRetryHandler(new DefaultHttpRequestRetryHandler())
                    .setConnectionManager(
                            new PoolingHttpClientConnectionManager()).build();
        else {
            client = HttpClientBuilder.create().setDefaultRequestConfig(buildRequestConfig(null)).build();
        }
        return client;
    }


    /**
     * 创建HttpClient
     *
     * @param isMultiThread
     * @return
     */
    public static HttpClient buildHttpClient(boolean isMultiThread, CookieStore cookieStore, HttpHost proxy) {
        CloseableHttpClient client;
        if (isMultiThread)
            client = HttpClientBuilder
                    .create().setDefaultCookieStore(cookieStore).setDefaultRequestConfig(buildRequestConfig(proxy))
                    .setRetryHandler(new DefaultHttpRequestRetryHandler())
                    .setConnectionManager(
                            new PoolingHttpClientConnectionManager()).build();
        else {
            client = HttpClientBuilder.create().setDefaultRequestConfig(buildRequestConfig(proxy)).setDefaultCookieStore(cookieStore).build();
        }
        return client;
    }

    /**
     * 构建httpPost对象
     *
     * @param url
     * @return
     * @throws UnsupportedEncodingException
     * @throws URISyntaxException
     */
    public static HttpPost buildHttpPost(String url, Map<String, String> params, String charset)
            throws UnsupportedEncodingException, URISyntaxException {

        HttpPost post = new HttpPost(url);
        setCommonHttpMethod(post);
        if (params != null) {
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            HttpEntity he = new UrlEncodedFormEntity(formparams, charset);
            post.setEntity(he);
        }
        return post;
    }

    public static HttpPost buildHttpJSONPost(String url, Map<String, String> params, String charset)
            throws UnsupportedEncodingException, URISyntaxException {

        HttpPost post = new HttpPost(url);
        setJSONHttpMethod(post);
        if (params != null) {
            String json = JSON.toJSONString(params);
            System.out.println(json);
            StringEntity stringEntity = new StringEntity(json, utf8);
            stringEntity.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, application_json));
            post.setEntity(stringEntity);
        }
        return post;
    }


    /**
     * 构建httpGet对象
     *
     * @param url
     * @return
     * @throws URISyntaxException
     */
    public static HttpGet buildHttpGet(String url, Map<String, String> params, String chatset) {

        return new HttpGet(buildGetUrl(url, params, chatset));
    }

    /**
     * build getUrl str
     *
     * @param url
     * @param params
     * @return
     */
    public static String buildGetUrl(String url, Map<String, String> params, String charset) {
        StringBuilder uriStr = new StringBuilder(url);
        if (params != null && !params.isEmpty()) {
            List<NameValuePair> ps = new ArrayList<NameValuePair>();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                ps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            uriStr.append("?");
            uriStr.append(URLEncodedUtils.format(ps, charset));
        }
        return uriStr.toString();
    }

    /**
     * 设置HttpMethod通用配置
     *
     * @param httpMethod
     */
    public static void setCommonHttpMethod(HttpRequestBase httpMethod) {
        httpMethod.setHeader(HTTP.CONTENT_ENCODING, utf8);// setting
    }

    /* 设置HttpMethod通用配置
     *
     * @param httpMethod
     */
    public static void setJSONHttpMethod(HttpRequestBase httpMethod) {
        httpMethod.setHeader(HTTP.CONTENT_ENCODING, utf8);// setting
        httpMethod.setHeader(HTTP.CONTENT_TYPE, application_json);// setting
    }

    /**
     * 设置成消息体的长度 setting MessageBody length
     *
     * @param httpMethod
     * @param he
     */
    public static void setContentLength(HttpRequestBase httpMethod, HttpEntity he) {
        if (he == null) {
            return;
        }
        httpMethod.setHeader(HTTP.CONTENT_LEN, String.valueOf(he.getContentLength()));
    }

    /**
     * 构建公用RequestConfig
     *
     * @return
     */
    public static RequestConfig buildRequestConfig(HttpHost proxy) {
        // 设置请求和传输超时时间
        return RequestConfig.custom().setProxy(proxy)
                .setSocketTimeout(SO_TIMEOUT_MS)
                .setConnectTimeout(CONNECTION_TIMEOUT_MS).build();
    }


    /**
     * 强验证必须是200状态否则报异常
     *
     * @param res
     * @throws HttpException
     */
    static void assertStatus(HttpResponse res) throws IOException {

        switch (res.getStatusLine().getStatusCode()) {
            case HttpStatus.SC_OK:
                break;
            default:
                throw new IOException("服务器响应状态异常,失败.");
        }
    }


    public static CookieStore getCookieStore(Map<String, String> cookieMap) {
        BasicCookieStore cookieStore = null;
        //Cookie 处理
        if (null != cookieMap && !cookieMap.isEmpty()) {
            cookieStore = new BasicCookieStore();
            for (Map.Entry<String, String> entry : cookieMap.entrySet()) {
                cookieStore.addCookie(new BasicClientCookie(entry.getKey(), entry.getValue()));
            }
        }
        return cookieStore;
    }


    public static void seHttpHeader(HttpMessage httpMessage, Map<String, String> headerMap) {
        //Cookie 处理
        if (null != headerMap && !headerMap.isEmpty()) {
            for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                httpMessage.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }


    public static String getWithCookie(String url, Map<String, String> params, Map<String, String> headerMap, CookieStore cookieStore, HttpHost proxy, String charset)
            throws IOException, URISyntaxException {


        HttpClient client = buildHttpClient(true, cookieStore, proxy);
        HttpGet get = buildHttpGet(url, params, charset);
        seHttpHeader(get, headerMap);



        HttpResponse response = client.execute(get);
        assertStatus(response);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            return EntityUtils.toString(entity, charset);
        }
        return null;
    }


    public void getWithCookie(String postCookoe) {


    }
}

