package com.bencaojc.controller;

import com.bencaojc.pojo.FeiyuClue;
import com.bencaojc.servise.FeiyuClueServer;
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
@RequestMapping("feiyuclue")
public class FeiyuClueConteoller {

    @Autowired
    FeiyuClueServer feiyuClueServer;

    @Value("${aotian.excel.file.uploadpath}")
    String fileUploadPath;

    @RequestMapping("/imp")
    public String toImpFeiyuClue(){
        return "feiyu/uploadfeiyu";
    }

    @RequestMapping(value="importFeiyu")
    @ResponseBody
    public ModelAndView importXls(MultipartFile uploadFile) throws IOException {
        String originalFilename = uploadFile.getOriginalFilename();
        String newFilePath = fileUploadPath+originalFilename;
        uploadFile.transferTo(new File(newFilePath));
        System.out.println(newFilePath);
        List<FeiyuClue> feiyuClueFromExcel = feiyuClueServer.getFeiyuClueFromExcel(newFilePath);
        feiyuClueServer.saveFeiyuClues(feiyuClueFromExcel);
        ModelAndView modelAndView = new ModelAndView("feiyu/uploadfeiyu");
        return modelAndView;
    }
}
