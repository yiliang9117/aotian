package com.bencaojc.controller;

import com.bencaojc.servise.ImprotServise;
import com.bencaojc.utils.HttpClientUtils;
import com.bencaojc.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static com.bencaojc.utils.HttpUtils.*;

@Controller
@RequestMapping("/upload")
public class ImportController {




    @Value("${aotian.domain}")
    private String basePath;

    @Value("${aotian.excel.file.uploadpath}")
    String fileUploadPath;

    @Value("${aotian.importXls.guesturl}")
    String importXlsGuesturl;

    @Value("${aotian.cookiestr}")
    String cookiestr;





    @Autowired
    ImprotServise improtServise;

    @Autowired
    HttpUtils httpUtils;



    /*导入线索页面路由*/
    @RequestMapping("/xls")
    public String importXls(){
        return "upload";
    }








    @RequestMapping(value="importXls")
    @ResponseBody
    public String importXls(String username,MultipartFile uploadFile) throws IOException {
        if (null ==uploadFile)
            return null;
        System.out.println(uploadFile.getName());
        //获得上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        System.out.println(username);

        String newFilePath = fileUploadPath+originalFilename.replace(".","-.");
        System.out.println(newFilePath);

        uploadFile.transferTo(new File(newFilePath));

        String importXlsStr = improtServise.importXls(newFilePath).replace("\n","");
        System.out.println("importXlsStr:"+importXlsStr);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Map<String, Object> prams = new HashMap<>();
        prams.put("action","handle");
        prams.put("page",1);
        prams.put("psize",10);
        prams.put("istest",1);
        prams.put("file_name",importXlsStr);







        Map<String,String> cookie = new HashMap<>();

        String[] split = cookiestr.split("=");
        if (null != split){
            cookie.put(split[0] , split[1]);
        }


        String s1 = httpUtils.doPostWithCookis(basePath + importXlsGuesturl, cookie, prams);
        System.out.println(s1);




       /* String url = "http://172.16.10.246:89/main.php";
        System.out.println("获取的：" + cookie);
        String s = doGetWithCookis(url, cookie);
        System.out.println(s);*/

       return s1;





    }

}
