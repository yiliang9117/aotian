package com.bencaojc.servise;

import com.bencaojc.mapper.AotianCustomerMapper;
import com.bencaojc.mapper.FeiyuClueMapper;
import com.bencaojc.pojo.AotianCustomer;
import com.bencaojc.pojo.FeiyuClue;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;

@Service
public class AotianCustomerService {

    @Autowired
    AotianCustomerMapper aotianCustomerMapper;


    public List<AotianCustomer> getAotianCustomerFromExcel(String excelPath) {
        List<AotianCustomer> aotianCustomers = new LinkedList<AotianCustomer>();
        try {
            File excel = new File(excelPath);
            if (excel.isFile() && excel.exists()) {   //判断文件是否存在
                String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！
                Workbook wb;
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
                for(int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                    Row row = sheet.getRow(rIndex);
                    if (row != null) {
                        AotianCustomer aotianCustomer = rowToAotianCustomer(row);
                        System.out.println(aotianCustomer);
                        aotianCustomers.add(aotianCustomer);
                    }
                }
                return aotianCustomers;
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }




    public AotianCustomer rowToAotianCustomer(Row row) {

        AotianCustomer aotianCustomer = new AotianCustomer();
        int firstCellIndex = row.getFirstCellNum();


        Cell cell1 = row.getCell(0);
        cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
        String stringCellValue = cell1.getStringCellValue();
        aotianCustomer.setAotianId(stringCellValue);


        Cell cell2 = row.getCell(1);
        cell2.setCellType(HSSFCell.CELL_TYPE_STRING);
        String name = cell2.getStringCellValue();
        aotianCustomer.setName(name);


        Cell cell3 = row.getCell(3);
        cell3.setCellType(HSSFCell.CELL_TYPE_STRING);
        String telephone = cell3.getStringCellValue();
        aotianCustomer.setTelephone(telephone);


        Cell cell8 = row.getCell(7);
        cell8.setCellType(HSSFCell.CELL_TYPE_STRING);
        String customerServiceId = cell8.getStringCellValue();
        aotianCustomer.setCustomerServiceId(customerServiceId);


        Cell cell9 = row.getCell(8);
        cell9.setCellType(HSSFCell.CELL_TYPE_STRING);
        String customerService = cell9.getStringCellValue();
        aotianCustomer.setCustomerService(customerService);

//客户等级
        Cell cell11 = row.getCell(10);
        cell11.setCellType(HSSFCell.CELL_TYPE_STRING);
        String customerGrade = cell11.getStringCellValue();
        aotianCustomer.setCustomerGrade(customerGrade);


        Cell cell12 = row.getCell(11);
        cell12.setCellType(HSSFCell.CELL_TYPE_STRING);
        String workingGroup = cell12.getStringCellValue();
        aotianCustomer.setWorkingGroup(workingGroup);

//媒体产品
        Cell cell22 = row.getCell(21);
        cell22.setCellType(HSSFCell.CELL_TYPE_STRING);
        String mediaProduct = cell22.getStringCellValue();
        aotianCustomer.setMediaProduct(mediaProduct);

        return aotianCustomer;
    }

    public void saveAotianCustomerList(List<AotianCustomer> aotianCustomers) {

        for (AotianCustomer aotianCustomer:aotianCustomers ){
            int count = aotianCustomerMapper.selectCountAotianCustomerByTelephone(aotianCustomer.getTelephone());
//            int count = 0;
            System.out.println(count);
            if (0==count){
                aotianCustomerMapper.insert(aotianCustomer);
                System.out.println(aotianCustomer);
            }
        }
    }
}
