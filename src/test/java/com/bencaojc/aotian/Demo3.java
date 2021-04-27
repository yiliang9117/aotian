package com.bencaojc.aotian;

import com.bencaojc.pojo.ImprotTelephoneNumber;
import com.github.abel533.easyxls.EasyXls;
import com.github.abel533.easyxls.bean.ExcelConfig;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.text.NumberFormat;
import java.util.LinkedList;
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


    /*
    * 按照需求比例分配算法
    * */

    @Test
    public void allot() {


        double ASize = 495;
        double BSize = 251;
        double allSize = ASize +BSize;

        double i1 = ASize / allSize * 10;
        int b;
        int a = new Double(i1).intValue();
        Double aDouble = Double.valueOf(a);
        if (aDouble >= i1){
            b = 10 - a;
        }else {
            b = 10 - a -1;
        }
        if (a%2 == 0 && b%2 == 0){
            a = a/2;
            b = b/2;
        }

        int c = a+b;
        System.out.println(a+"-"+b+"-"+c);
        int allSizeInt = new Double(allSize).intValue();
        int allIndex =allSizeInt/c;
        int tempIndex =0;

        List<Integer> list = new LinkedList<>();
        for (int i = 0;i<=allSize;i++) {
            list.add(i);
        }

        List<Integer> Alist = new LinkedList<>();
        List<Integer> Blist = new LinkedList<>();

        for (int i = 0;i<=allIndex;i++){
            for (int j = 0;j<c;j++){
                if(j<a){
                    Alist.add(list.get(tempIndex));
                }else {
                    Blist.add(list.get(tempIndex));
                }
                tempIndex++;
            }
        }


        System.out.println("tempIndex:"+allSizeInt);

        System.out.println("Alist："+Alist.size());
        System.out.println("Blist："+Blist.size());
        int surplus = allSizeInt-Alist.size()-Blist.size();

        System.out.println("Blist："+surplus);
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Alist："+Alist);
        System.out.println();

        System.out.println("Blist："+Blist);














    }



    @Test
    public void allot2() {



    }





}
