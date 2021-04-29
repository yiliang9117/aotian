package com.bencaojc.servise;

import com.bencaojc.mapper.FeiyuClueMapper;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class FeiyuClueServer {


    @Autowired
    FeiyuClueMapper feiyuClueMapper;

    public List<FeiyuClue> getFeiyuClueFromExcel(String excelPath) {
        List<FeiyuClue> feiyuClueList = new LinkedList<FeiyuClue>();
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
                        FeiyuClue feiyuClue = rowToFeiyuclue(row);
                        String clueId = feiyuClue.getClueId();
                        System.out.println(feiyuClue);

                        if (-1==clueId.indexOf("线索")){
                            feiyuClueList.add(feiyuClue);
                        }
                    }
                }
                return feiyuClueList;
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public FeiyuClue rowToFeiyuclue(Row row) {

        FeiyuClue feiyuClue = new FeiyuClue();
        int firstCellIndex = row.getFirstCellNum();




        Cell cell1 = row.getCell(0);
        cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
        String stringCellValue = cell1.getStringCellValue();
        feiyuClue.setClueId(stringCellValue);

        Cell cell2 = row.getCell(1);
        cell2.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setName(cell2.getStringCellValue());
//电话
        Cell cell3 = row.getCell(2);
        cell3.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell3.getStringCellValue());

//推广链接
        Cell cell11 = row.getCell(10);
        cell11.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setExternalUrl(cell11.getStringCellValue());




        /*Cell cell4 = row.getCell(3);
        cell4.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell4.getStringCellValue());


        Cell cell5 = row.getCell(4);
        cell5.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell5.getStringCellValue());


        Cell cell6 = row.getCell(5);
        cell6.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell6.getStringCellValue());


        Cell cell7 = row.getCell(6);
        cell7.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell7.getStringCellValue());


        Cell cell8 = row.getCell(7);
        cell8.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell8.getStringCellValue());


        Cell cell9 = row.getCell(8);
        cell9.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell9.getStringCellValue());


        Cell cell10 = row.getCell(9);
        cell10.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell10.getStringCellValue());



        Cell cell12 = row.getCell(11);
        cell12.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell12.getStringCellValue());


        Cell cell13 = row.getCell(12);
        cell13.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell13.getStringCellValue());



        Cell cell14 = row.getCell(13);
        cell14.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell14.getStringCellValue());



        Cell cell15 = row.getCell(14);
        cell15.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell15.getStringCellValue());



        Cell cell16 = row.getCell(15);
        cell16.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell16.getStringCellValue());



        Cell cell17 = row.getCell(16);
        cell17.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell17.getStringCellValue());



*/


//组建id
        Cell cell20 = row.getCell(19);
        cell20.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setModuleId(cell20.getStringCellValue());


//组建名称
        Cell cell21 = row.getCell(20);
        cell21.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setModuleName(cell21.getStringCellValue());

// 广告id
        Cell cell22 = row.getCell(21);
        cell22.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setAdId(cell22.getStringCellValue());
        System.out.println(cell22.getStringCellValue());


        //广告主名称
        Cell cell29 = row.getCell(28);

        if (null!=cell29){
            cell29.setCellType(HSSFCell.CELL_TYPE_STRING);
            feiyuClue.setAdvertiserName(cell29.getStringCellValue());

//计划名称
            Cell cell23 = row.getCell(22);
            if (null!=cell23){
                cell23.setCellType(HSSFCell.CELL_TYPE_STRING);
                feiyuClue.setAdName(cell23.getStringCellValue());
                feiyuClue.setAdvertiserNameAdName(cell29.getStringCellValue()+"-"+cell23.getStringCellValue());
            }else {
                feiyuClue.setAdvertiserNameAdName(cell29.getStringCellValue()+"-"+ "未知");

                feiyuClue.setAdName("未知");
            }

        }else {
            feiyuClue.setAdvertiserNameAdName("未知账户-"+ "未知");
            feiyuClue.setAdName("未知");
        }



//创建时间
        Cell cell27 = row.getCell(26);
        cell27.setCellType(HSSFCell.CELL_TYPE_STRING);
        String stringCellValue1 = cell27.getStringCellValue();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(stringCellValue1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        feiyuClue.setCreateTimeDetail(date);
//广告主id

        Cell cell28 = row.getCell(27);
        cell28.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setAdvertiserId(cell28.getStringCellValue());



       /* Cell cell = row.getCell(22);
        cell.setCellType(HSSFCell.CELL_TYPE_STRING);
        feiyuClue.setTelephone(cell.getStringCellValue());*/




        return feiyuClue;
    }


    public void saveFeiyuClues(List<FeiyuClue> feiyuClueFromExcel) {

        System.out.println(feiyuClueFromExcel);
        if(null == feiyuClueFromExcel){
            return;
        }

        for (int i=0;i<feiyuClueFromExcel.size();i++){
            System.out.println("飞鱼，共："+feiyuClueFromExcel.size()+"个，第"+i+"个");

            int count = feiyuClueMapper.selectCountByClueId(feiyuClueFromExcel.get(i).getClueId());
            System.out.println(count);
            if (0==count){
                feiyuClueMapper.insert(feiyuClueFromExcel.get(i));
            }
        }
    }
}
