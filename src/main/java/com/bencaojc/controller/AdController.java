package com.bencaojc.controller;

import com.alibaba.fastjson.JSON;
import com.bencaojc.servise.AdQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ad")
public class AdController {

    @Autowired
    AdQualityService adQualityService;

    @RequestMapping("/1")
    @ResponseBody
    public String toAd(){

        List<String> adData = adQualityService.getAdData();

        return JSON.toJSONString(adData);
    }
}
