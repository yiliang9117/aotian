package com.bencaojc.aotian;

import com.github.chimmhuang.excel.ExcelHelper;
import com.github.chimmhuang.excel.tablemodel.ExcelWorkbook;
import com.github.chimmhuang.excel.tablemodel.Row;
import com.github.chimmhuang.excel.tablemodel.SheetTable;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;

public class Demo2 {


    @Test
    public void testFillInTable() throws Exception {



        // 获取 excel 二进制文件
        File file = new File("D:\\soft\\develop\\aotian\\src\\main\\resources\\2.xls");
        byte[] bytes = FileUtils.readFileToByteArray(file);





        SheetTable sheetTable = ExcelHelper.getSheetTable(bytes);

        int lastRowNum = sheetTable.getLastRowNum();
        System.out.println(lastRowNum);



    }
}
