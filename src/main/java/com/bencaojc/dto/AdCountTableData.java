package com.bencaojc.dto;

import java.text.DecimalFormat;

public class AdCountTableData {

    public String advertiserNameAdName;
    public int clueSum;
    public int aClue;
    public int bClue;
    public int cClue;
    public int dClue;
    public int eClue;
    public int nullClue;
    public double  turnoverRatio;

    @Override
    public String toString() {
        return "AdCountTableData{" +
                "advertiserNameAdName=" + advertiserNameAdName +
                ", clueSum=" + clueSum +
                ", aClue=" + aClue +
                ", bClue=" + bClue +
                ", cClue=" + cClue +
                ", dClue=" + dClue +
                ", eClue=" + eClue +
                ", nullClue=" + nullClue +
                ", turnoverRatio=" + turnoverRatio +
                '}';
    }

    public String getAdvertiserNameAdName() {
        return advertiserNameAdName;
    }

    public void setAdvertiserNameAdName(String advertiserNameAdName) {
        this.advertiserNameAdName = advertiserNameAdName;
    }

    public int getClueSum() {
        return clueSum;
    }

    public void setClueSum(int clueSum) {
        this.clueSum = clueSum;
    }

    public int getaClue() {
        return aClue;
    }

    public void setaClue(int aClue) {
        this.aClue = aClue;
    }

    public int getbClue() {
        return bClue;
    }

    public void setbClue(int bClue) {
        this.bClue = bClue;
    }

    public int getcClue() {
        return cClue;
    }

    public void setcClue(int cClue) {
        this.cClue = cClue;
    }

    public int getdClue() {
        return dClue;
    }

    public void setdClue(int dClue) {
        this.dClue = dClue;
    }

    public int geteClue() {
        return eClue;
    }

    public void seteClue(int eClue) {
        this.eClue = eClue;
    }

    public int getNullClue() {
        return nullClue;
    }

    public void setNullClue(int nullClue) {
        this.nullClue = nullClue;
    }

    public double getTurnoverRatio() {

        if (aClue>0){

            return Double.valueOf(txfloat(aClue,clueSum));

        }else {
            return 0;
        }
    }

    public void setTurnoverRatio(int turnoverRatio) {
        this.turnoverRatio = turnoverRatio;
    }



    public static String txfloat(int a,int b) {
        DecimalFormat df=new DecimalFormat("0.00");//设置保留位数
        return df.format((float)a/b);
    }
}
