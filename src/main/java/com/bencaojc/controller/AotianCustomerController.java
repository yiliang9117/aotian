package com.bencaojc.controller;

import com.bencaojc.pojo.AotianCustomer;
import com.bencaojc.pojo.FeiyuClue;
import com.bencaojc.servise.AotianCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/aotianCustomer")
public class AotianCustomerController {

    @Autowired
    AotianCustomerService aotianCustomerService;

    @Value("${aotian.excel.file.uploadpath}")
    String fileUploadPath;

    @RequestMapping("/imp")
    public String toImpFeiyuClue(){
        return "aotiancustroller/uploadaotian";
    }


    @RequestMapping(value="importAotian")
    @ResponseBody
    public ModelAndView importXls(MultipartFile uploadFile) throws IOException {
        String originalFilename = uploadFile.getOriginalFilename();
        String newFilePath = fileUploadPath+originalFilename;
        uploadFile.transferTo(new File(newFilePath));
        List<AotianCustomer> feiyuClueFromExcel = aotianCustomerService.getAotianCustomerFromExcel(newFilePath);
        aotianCustomerService.saveAotianCustomerList(feiyuClueFromExcel);
        ModelAndView modelAndView = new ModelAndView("/aotiancustroller/uploadaotian");
        return modelAndView;
    }

}
