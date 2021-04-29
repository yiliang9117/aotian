package com.bencaojc.aotian;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TableTest {


    public static void main(String[] args) {
/*
        LinkedList<String> biaoTouX = new LinkedList<>();//{姓名，电话，年龄}

        LinkedList<String> lieTouY = new LinkedList<>();//{，张三，李四，王五}

        LinkedList<Map<String, String>> maps = new LinkedList<>();*/


        int aClue = 10;
        int clueSum = 100;

        String txfloat = txfloat(aClue, clueSum);
        System.out.println(txfloat);
        DecimalFormat df = new DecimalFormat("0.00");
        String format1 = df.format(aClue / clueSum);
        System.out.println(format1);


        String format = String.format("%.2f", aClue / clueSum);
        System.out.println(format);






    }
    public static String txfloat(int a,int b) {
        DecimalFormat df=new DecimalFormat("0.0000");//设置保留位数
        return df.format((float)a/b*100);
    }




    public List<Object> listToTable(List<Object> objectList){



        return null;




    }

}
