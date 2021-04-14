package com.bencaojc.controller;

import com.alibaba.fastjson.JSON;
import com.bencaojc.pojo.ImprotTelephoneNumber;
import com.bencaojc.servise.ImprotServise;
import com.bencaojc.utils.ExcelUtils;
import com.bencaojc.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/upload")
public class ImportController {




    @Value("${aotian.domain}")
    private String basePath;

    @Value("${aotian.excel.file.uploadpath}")
    String fileUploadPath;

    @Value("${aotian.cookiestr}")
    String cookiestr;


//    String newExcelPath = "D:\\soft\\develop\\aotian\\src\\main\\resources\\13\\";



    @Autowired
    ImprotServise improtServise;

    @Autowired
    HttpUtils httpUtils;

    @Autowired
    ExcelUtils excelUtils;



    /*导入线索页面路由*/
    @RequestMapping("/xls")
    public String importXls(){
        return "upload/upload";
    }




    @RequestMapping(value="importXls")
    @ResponseBody
    public ModelAndView importXls(String username, MultipartFile uploadFile) throws IOException {

        //获得上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        String newFilePath = fileUploadPath+originalFilename;

        uploadFile.transferTo(new File(newFilePath));


//        表格去重
        List<ImprotTelephoneNumber> phoneNumberListFromExcel = excelUtils.getPhoneNumberListFromExcel(newFilePath);
        List<ImprotTelephoneNumber> improtTelephoneNumbers = excelUtils.removeDuplicationPhoneNumber(phoneNumberListFromExcel);
        String list2ExcelPath = excelUtils.list2Excel(fileUploadPath, improtTelephoneNumbers);



        Map<String, String> repeatPhones = improtServise.importXls(list2ExcelPath);


        ModelAndView modelAndView = new ModelAndView("upload/importXls");

        modelAndView.addObject("repeatPhone" , repeatPhones);
        modelAndView.addObject("repeatSize" , repeatPhones.size());
        modelAndView.addObject("allImpPhoneSise" , phoneNumberListFromExcel.size());
        modelAndView.addObject("allPhoneSise" , improtTelephoneNumbers.size());
        modelAndView.addObject("newPhoneSise" , improtTelephoneNumbers.size()-repeatPhones.size());
        modelAndView.addObject("repeatPhoneSise" , phoneNumberListFromExcel.size()-improtTelephoneNumbers.size());
        System.out.println(repeatPhones);


        return modelAndView;

    }

}
