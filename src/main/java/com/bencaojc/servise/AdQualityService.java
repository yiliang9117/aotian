package com.bencaojc.servise;

import com.bencaojc.dto.AdCountTableData;
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


    public List<AdCountTableData> getAdData(){

        /*
        * 查出条件下，所有计划名称
        * 按照计划名称，查询客户等级数量
        * */

        AdNameCustomerGradeCount adNameCustomerGradeCount = new AdNameCustomerGradeCount();

        List<AdCountTableData> adCountTableData = aotianCustomerMapper.selectAdCountByGradeToTable(adNameCustomerGradeCount);

/*
        List<AdNameCustomerGradeCount> allAdnameNum = aotianCustomerMapper.selectAdNameListAndCount(adNameCustomerGradeCount);
        //广告名称 + 所有数量


        List<AdNameCustomerGradeCount> allGrade = aotianCustomerMapper.selectAllGrade();
//        客户等级 + 数量


        for (AdNameCustomerGradeCount adcount:allGrade){
            //该等级下 分别广告数量
            List<AdNameCustomerGradeCount> adNumByGrade = aotianCustomerMapper.selectAdCountByGrade(adcount);
            System.out.println(adNumByGrade);
        }*/









//        List<AdNameCustomerGradeCount> allAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);

/*
        for (AdNameCustomerGradeCount adName:allAdNum){
            List<AdNameCustomerGradeCount> AdNameGradeCount =aotianCustomerMapper.selectCountByAdNameList(adName);
            System.out.println(AdNameGradeCount);
        }*/
//        System.out.println(allAdNum);

















/*
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
        List<AdNameCustomerGradeCount> nullAdNum = aotianCustomerMapper.selectCountByCustomerGrade(adNameCustomerGradeCount);*/

//行头
        /*
        *  ['A级客户', 'B级客户', 'C级客户', 'D级客户', 'E级客户','无','合计']
        * */
     /*   List<String> xIndex = new LinkedList<String>();
        xIndex.add("A级客户");
        xIndex.add("B级客户");
        xIndex.add("C级客户");
        xIndex.add("D级客户");
        xIndex.add("E级客户");
        xIndex.add("无");
*/


     //   List<AdNameCustomerGradeCount> allAdNum = aotianCustomerMapper.selectCountByCustomerGradeList(xIndex);

        /*
        * ['上医1-不知道的计划', '上医3-8962的计划', '上医6-545计划', '上医8-不知道计划', '本草1-计划', '最后一']
        * */
      /*  List<String> yAxis = new LinkedList<>();
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
*/








        return adCountTableData;
    }

    public List<Object> listToTable(List<Object> objectList){



        return null;




    }











}
