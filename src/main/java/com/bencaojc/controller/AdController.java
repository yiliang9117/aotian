package com.bencaojc.controller;

import com.alibaba.fastjson.JSON;
import com.bencaojc.dto.AdCountTableData;
import com.bencaojc.servise.AdQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/ad")
public class AdController {

    @Autowired
    AdQualityService adQualityService;



    @RequestMapping("/2")
    public ModelAndView toAdTable(){
        ModelAndView modelAndView = new ModelAndView("ad/adtable");

        List<AdCountTableData> adData = adQualityService.getAdData();

        modelAndView.addObject("adData",adData);


        return modelAndView;
    }

    @RequestMapping("/1")
    public ModelAndView toAd(){
        ModelAndView modelAndView = new ModelAndView("ad/ad");

        List<AdCountTableData> adData = adQualityService.getAdData();

        LinkedList<String> yAxis = new LinkedList<>();
        LinkedList<Integer> aData = new LinkedList<>();
        LinkedList<Integer> bData = new LinkedList<>();
        LinkedList<Integer> cData = new LinkedList<>();
        LinkedList<Integer> dData = new LinkedList<>();
        LinkedList<Integer> eData = new LinkedList<>();
        LinkedList<Integer> nData = new LinkedList<>();
        LinkedList<Integer> aalData = new LinkedList<>();
        LinkedList<Double> turnoverRatio = new LinkedList<>();

        for (AdCountTableData ad :adData){


            System.out.println(ad);
            yAxis.add("\'"+ad.getAdvertiserNameAdName()+"\'");
            aData.add(ad.getaClue());
            bData.add(ad.getbClue());
            cData.add(ad.getcClue());
            dData.add(ad.getdClue());
            eData.add(ad.geteClue());
            nData.add(ad.getNullClue());
            aalData.add(ad.getClueSum());
            turnoverRatio.add(ad.getTurnoverRatio());



        }
        System.out.println(yAxis);






        modelAndView.addObject("yAxis",yAxis);


        modelAndView.addObject("aData",aData);
        modelAndView.addObject("bData",bData);
        modelAndView.addObject("cData",cData);
        modelAndView.addObject("dData",dData);
        modelAndView.addObject("eData",eData);
        modelAndView.addObject("nData",nData);
        modelAndView.addObject("aalData",aalData);
        modelAndView.addObject("turnoverRatio",turnoverRatio);

        return modelAndView;
    }
}
