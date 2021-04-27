package com.bencaojc.dto;

public class AdNameCustomerGradeCount {

    private String customerGrade;
    private String advertiserAdName;
    private int countNum;

    @Override
    public String toString() {
        return "CustomerGradeCount{" +
                "advertiserAdName='" + advertiserAdName + '\'' +
                ", countNum=" + countNum +
                '}';
    }

    public String getAdvertiserAdName() {
        return advertiserAdName;
    }

    public void setAdvertiserAdName(String advertiserAdName) {
        this.advertiserAdName = advertiserAdName;
    }

    public int getCountNum() {
        return countNum;
    }

    public void setCountNum(int countNum) {
        this.countNum = countNum;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
