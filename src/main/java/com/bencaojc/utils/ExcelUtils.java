package com.bencaojc.utils;

import com.bencaojc.pojo.ImprotTelephoneNumber;
import com.github.abel533.easyxls.EasyXls;
import com.github.abel533.easyxls.bean.ExcelConfig;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ExcelUtils {




    /*
    * 根据所需个数返回前面的电话列表
    * */
    public List<ImprotTelephoneNumber>  getHeadPhoneByNumber(int number, List<ImprotTelephoneNumber> phoneNumbers) {
        int getNumber = 0;
        int size = phoneNumbers.size();

        if (size < number){
            getNumber = size;
        } else{
            getNumber = number;
        }

        System.out.println("获取前面" + getNumber + "个电话");

        List<ImprotTelephoneNumber> tempLists = new LinkedList<>();

        for (int i = 0; i < getNumber; i++) {
            tempLists.add(phoneNumbers.get(size-i-1));
        }
        Collections.reverse(tempLists);
        System.out.println("今日电话列表："+tempLists);
        return tempLists;
    }

    /*
    * 将电话对象list列表写成表格
    * */
    public String list2Excel(String newExcelPath,List phoneNumbers) {
        System.out.println("总共新线索："+phoneNumbers.size() + "个");
        String fileName = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(new Date()) + ".xls";
        try {
            ExcelConfig config = new ExcelConfig.Builder(ImprotTelephoneNumber.class)
                    .sheetNum(1)
                    .startRow(1)
                    .separater(",")
                    .key("name")
                    .addColumn("userName,姓名", "phoneNumber,电话", "comeinAccount,渠道","ownersname,媒体产品").build();
            System.out.println("新线索表格文件地址："+newExcelPath+fileName);

            EasyXls.list2Xls(config,phoneNumbers, newExcelPath,fileName);;

            return newExcelPath+fileName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    /*
    * 电话去重
    * */
    public  List<ImprotTelephoneNumber>  removeDuplicationPhoneNumber(List<ImprotTelephoneNumber> allList) {

        System.out.println("正在读取Excel文件……");
        List<ImprotTelephoneNumber> tempLists = new LinkedList<>();
        Set<String> tempPhoneSet = new HashSet<>();
        for (int i = 0; i < allList.size(); i++) {
            ImprotTelephoneNumber phoneNumber = allList.get(i);
            String phoneNumber1 = phoneNumber.getPhoneNumber();
            boolean add = tempPhoneSet.add(phoneNumber1);
            if (add){
                phoneNumber.setComeinAccount("今日头条");
                phoneNumber.setOwnersname("本草极萃机三代");
                tempLists.add(phoneNumber);
            }
        }
        return tempLists;
    }

    /*
    * 读取电话列表
    * */
    public List<ImprotTelephoneNumber> getPhoneNumberListFromExcel(String excelPath) {

        System.out.println("正在读取Excel文件……");
        List<ImprotTelephoneNumber> phoneNumberList = new LinkedList<ImprotTelephoneNumber>();

        try {
            //String encoding = "GBK";
            File excel = new File(excelPath);
            if (excel.isFile() && excel.exists()) {   //判断文件是否存在

                String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！
                Workbook wb;
                //根据文件后缀（xls/xlsx）进行判断
                if ( "xls".equals(split[1])){
                    FileInputStream fis = new FileInputStream(excel);   //文件流对象
                    wb = new HSSFWorkbook(fis);
                }else if ("xlsx".equals(split[1])){
                    wb = new XSSFWorkbook(excel);
                }else {
                    System.out.println("文件类型错误!");
                    return null;
                }

                //开始解析
                Sheet sheet = wb.getSheetAt(0);     //读取sheet 0

                int firstRowIndex = sheet.getFirstRowNum()+1;   //第一行是列名，所以不读
                int lastRowIndex = sheet.getLastRowNum();
//                System.out.println("firstRowIndex: "+firstRowIndex);
//                System.out.println("lastRowIndex: "+lastRowIndex);

                for(int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                    //System.out.println("rIndex: " + rIndex);
                    ImprotTelephoneNumber improtTelephoneNumber = new ImprotTelephoneNumber();
                    Row row = sheet.getRow(rIndex);
                    if (row != null) {
                        int firstCellIndex = row.getFirstCellNum();
                        int lastCellIndex = row.getLastCellNum();
                        Cell cell1 = row.getCell(0);
                        cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
                        improtTelephoneNumber.setUserName(cell1.getStringCellValue() );


                        Cell cell2 = row.getCell(1);
                        cell2.setCellType(HSSFCell.CELL_TYPE_STRING);
                        improtTelephoneNumber.setPhoneNumber(cell2.getStringCellValue());

//                        System.out.println(improtTelephoneNumber);
                        phoneNumberList.add(improtTelephoneNumber);
                    }
                }
                return phoneNumberList;
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
