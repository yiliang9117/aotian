package com.bencaojc.servise;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ImprotServise {


    @Value("${aotian.domain}")
    private String basePath;

    @Value("${aotian.importXls.url}")
    private String importXlsUrl;

    @Value("${aotian.importXls.istest}")
    private String istest;

    @Value("${aotian.importXls.guesturl}")
    String importXlsGuesturl;



    public Map<String, String> importXls(String filepath) throws IOException {

        String replace = filepath.replace("\\", "/");
        String urlStr = basePath + importXlsUrl+istest;
        System.out.println("urlStr" + urlStr);
        System.out.println("filepath:"+filepath);

//        表格去重





//        给傲天上传表格
        Map<String, String> textMap = new HashMap<String, String>();
        textMap.put("name", "testname");
        Map<String, String> fileMap = new HashMap<String, String>();
        fileMap.put("file_add", replace);
        String ret = formUpload(urlStr, textMap, fileMap);

//        第二次伪上传   获取重复线索
        Map<String, String> textMap2 = new HashMap<String, String>();
        textMap2.put("action", "handle");
        textMap2.put("page","1");
        textMap2.put("psize","10");
        textMap2.put("istest",istest+"");
        textMap2.put("file_name",ret.replace("\n",""));
        //      textMap2.put("file_name","20210414141628");
        Map<String, String> fileMap2 = new HashMap<String, String>();
        String s = this.formUpload(basePath + importXlsGuesturl, textMap2, fileMap2);
        String JsonStr = String.valueOf(JSON.parse(s));


//      清洗重线
        Map<String, String> repeatPhones = this.getRepeatPhones(JsonStr);
        return repeatPhones;
    }



    public Map<String, String> getRepeatPhones(String jsonStr){
        Map<String, String> repeatPhones = new HashMap<>();
        Pattern allStrP =Pattern.compile("(【.*?】)");
        Matcher allStrM=allStrP.matcher(jsonStr);
        while(allStrM.find()) {
            String allStr = allStrM.group();
            String replace = allStr.replace("【 ", "").replace(" 】", "");
            String[] split = replace.split("--");
            repeatPhones.put(split[0],split[1]);
        }
        return repeatPhones;
    }








    /*
    * 模拟表格上传文件
    * */
    public String formUpload(String urlStr, Map<String, String> textMap,
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
        System.out.println(res);
        return res;
    }



}
