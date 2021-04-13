package com.bencaojc.controller;

import com.bencaojc.servise.SalesDataServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SalesDataController {

    @Autowired
    private SalesDataServise salesDataServise;



    @RequestMapping("/salesdata")
    public ModelAndView toSatlesDataPage(){


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("salesdata/index");

        salesDataServise.getDepartmentSaleData();









        return modelAndView;
    }



}
