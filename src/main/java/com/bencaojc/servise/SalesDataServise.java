package com.bencaojc.servise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SalesDataServise {

    @Value("${aotian.domain}")
    private String aotianDomain;


    @Value("${aotian.domain}")
    private String aotianUser;


    @Value("${aotian.domain}")
    private String aotianPassword;


    /*分别获取一部二部销售额*/
    public Map getDepartmentSaleData() {
        HashMap<String, String> stringStringHashMap = new HashMap<>();




        return stringStringHashMap;
    }



}
