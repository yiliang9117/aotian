package com.bencaojc.servise;

import com.bencaojc.dto.AdNameCustomerGradeCount;
import com.bencaojc.mapper.AotianCustomerMapper;
import com.bencaojc.mapper.FeiyuClueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AdQualityService {



    @Autowired
    AotianCustomerMapper aotianCustomerMapper;

    @Autowired
    FeiyuClueMapper feiyuClueMapper;


    public List<String> getAdData(){
        AdNameCustomerGradeCount adNameCustomerGradeCount = new AdNameCustomerGradeCount();

        List<AdNameCustomerGradeCount> allAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);

        adNameCustomerGradeCount.setCustomerGrade("A级客户");
        List<AdNameCustomerGradeCount> aAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);


        adNameCustomerGradeCount.setCustomerGrade("B级客户");
        List<AdNameCustomerGradeCount> bAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);


        adNameCustomerGradeCount.setCustomerGrade("C级客户");
        List<AdNameCustomerGradeCount> cAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);


        adNameCustomerGradeCount.setCustomerGrade("D级客户");
        List<AdNameCustomerGradeCount> dAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);


        adNameCustomerGradeCount.setCustomerGrade("E级客户");
        List<AdNameCustomerGradeCount> eAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);


        adNameCustomerGradeCount.setCustomerGrade("无");
        List<AdNameCustomerGradeCount> nullAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);

//行头
        /*
        *  ['A级客户', 'B级客户', 'C级客户', 'D级客户', 'E级客户','无','合计']
        * */
        List<String> xIndex = new LinkedList<String>();
        xIndex.add("A级客户");
        xIndex.add("B级客户");
        xIndex.add("C级客户");
        xIndex.add("D级客户");
        xIndex.add("E级客户");
        xIndex.add("无");

        /*
        * ['上医1-不知道的计划', '上医3-8962的计划', '上医6-545计划', '上医8-不知道计划', '本草1-计划', '最后一']
        * */
        List<String> yAxis = new LinkedList<>();
        for (AdNameCustomerGradeCount adCount:allAdNum){
            yAxis.add(adCount.getAdvertiserAdName());
        }


        List<String> xData = new LinkedList<String>();
        for (int i=0;i<=yAxis.size()-1;i++){
            String s = yAxis.get(i);//'上医1-不知道的计划'
            AdNameCustomerGradeCount adNameCustomerGradeCount1 = new AdNameCustomerGradeCount();
            adNameCustomerGradeCount1.setAdvertiserAdName(s);
            List<AdNameCustomerGradeCount> adNameCustomerGradeCounts = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount1);



        }








        System.out.println(allAdNum);

        return xData;
    }




}
