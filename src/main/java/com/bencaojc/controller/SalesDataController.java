package com.bencaojc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/salesdata")
@Controller
public class SalesDataController {



    @RequestMapping("1")
    public ModelAndView toSatlesDataPage(){


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("salesdata/index");

        return modelAndView;
    }


    @RequestMapping("2")
    public String toSatlesDataPage2(){
        System.out.println(2);
        return "/salesdata/index";
    }


    @RequestMapping("3")
    public String toSatlesDataPage3(){
        System.out.println(3);
        return "salesdata/index.jsp";
    }


    @RequestMapping("4")
    public String toSatlesDataPage4(){
        System.out.println(4);
        return "salesdata/index";
    }


    @RequestMapping("5")
    public String toSatlesDataPage5(){
        System.out.println(5);
        return "index";
    }





}
