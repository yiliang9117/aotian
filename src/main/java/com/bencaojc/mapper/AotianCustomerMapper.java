package com.bencaojc.mapper;

import com.bencaojc.dto.AdCountTableData;
import com.bencaojc.dto.AdNameCustomerGradeCount;
import com.bencaojc.pojo.AotianCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface AotianCustomerMapper {


    int insert(AotianCustomer record);



    @Select("SELECT COUNT(1) FROM aotian_customer WHERE telephone =#{telephone}")
    int selectCountAotianCustomerByTelephone(String telephone);




//查询本时间段各计划进线总数量
    /*@Select("SELECT a.ad_name,count(1)FROM aotian_customer a, feiyu_clue f WHERE " +
            "a.telephone = f.telephone " +
            "AND create_time_detail >= '2021-04-01' " +
            "AND create_time_detail <= '2021-04-27' " +
            "AND customer_grade =#{uid}"+
            "GROUP BY ad_name " +
            "ORDER BY COUNT(1) DESC;")*/
    List<AdNameCustomerGradeCount> selectCountByCustomerGrade(AdNameCustomerGradeCount customerGrade);


    List<AdNameCustomerGradeCount> selectCountByAdNameList(AdNameCustomerGradeCount adName);

    List<AdNameCustomerGradeCount> selectAdNameListAndCount(AdNameCustomerGradeCount adNameCustomerGradeCount);

    List<AdNameCustomerGradeCount> selectAllGrade();

    List<AdNameCustomerGradeCount> selectAdCountByGrade(AdNameCustomerGradeCount adcount);

    List<AdCountTableData> selectAdCountByGradeToTable(AdNameCustomerGradeCount adcount);
}