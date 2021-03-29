package com.bencaojc.aotian;

import com.bencaojc.pojo.ImprotTelephoneNumber;
import com.github.abel533.easyxls.EasyXls;
import com.github.abel533.easyxls.bean.ExcelConfig;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class Demo3 {

    @Test
    public void testEasyXls() throws Exception {

        try {
            //创建一个配置
            ExcelConfig config = new ExcelConfig.Builder(ImprotTelephoneNumber.class)
                    .sheetNum(0)
                    .startRow(1)
                    .key("Sheet1")
                    .addColumn("userName", "phoneNumber").build();

            String path = "D:\\soft\\develop\\aotian\\src\\main\\resources\\2.xls";
            path="2.xls";


            List list = EasyXls.xls2List(config, Demo3.class.getResourceAsStream(path));
            for (int i = 0; i < list.size(); i++) {
                System.out.println(((ImprotTelephoneNumber) list.get(i)).getOwnersname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
