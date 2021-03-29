package com.bencaojc.aotian;

import com.bencaojc.pojo.ImprotTelephoneNumber;
import com.github.abel533.easyxls.EasyXls;
import com.github.abel533.easyxls.bean.ExcelConfig;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo4 {


    @Test
    public void testConfig() {
        try {
            //创建一个配置
            ExcelConfig config = new ExcelConfig.Builder(ImprotTelephoneNumber.class)
                    .sheetNum(0)
                    .startRow(1)
                    .key("name")
                    .addColumn("userName", "phoneNumber","comeinAccount","ownersname").build();

            // 获取 excel 二进制文件
            File file = new File("D:\\soft\\develop\\aotian\\src\\main\\resources\\2.xls");
            byte[] bytes = FileUtils.readFileToByteArray(file);

            List list = EasyXls.xls2List(config, file);

            List<ImprotTelephoneNumber> improtTelephoneNumbers = removeDuplicationPhoneNumber(list);
            System.out.println(improtTelephoneNumbers);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
    * 电话去重
    * */
    public  List<ImprotTelephoneNumber>  removeDuplicationPhoneNumber(List allList) {
        System.out.println(allList);

        List<ImprotTelephoneNumber> tempLists = new ArrayList<>();

        for (int i = 0; i < allList.size(); i++) {

            ImprotTelephoneNumber phoneNumber = (ImprotTelephoneNumber) allList.get(i);
            String newPhoneNumber = phoneNumber.getPhoneNumber();
            System.out.println(newPhoneNumber);

            for (int j = 0; j < tempLists.size(); j++) {
                ImprotTelephoneNumber tempTele = tempLists.get(j);
                String tempPhoneNumber = tempTele.getPhoneNumber();
                System.out.println(tempPhoneNumber);
                if (null != newPhoneNumber && tempPhoneNumber == newPhoneNumber) {
                    tempLists.add(tempTele);
                    System.out.println(tempTele);

                }
            }

        }
        return tempLists;
    }


}
