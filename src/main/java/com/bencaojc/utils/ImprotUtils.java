package com.bencaojc.utils;

import com.bencaojc.pojo.ImprotTelephoneNumber;
import com.github.abel533.easyxls.EasyXls;
import com.github.abel533.easyxls.bean.ExcelConfig;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;

public class ImprotUtils {


    /*
    * Excel表格去重
    * 并去重
    * */

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
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i);
                System.out.println(list.size());
                System.out.println(list.get(i));

                System.out.println(((ImprotTelephoneNumber) list.get(i)).getUserName());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
