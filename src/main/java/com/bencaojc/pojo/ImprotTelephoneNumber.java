package com.bencaojc.pojo;

import java.util.Date;
/*
* 导入电话实体
* */
public class ImprotTelephoneNumber {

    public String userName;
    public String phoneNumber;
    public Date creatTime;
    public String comeinAccount;
    public String ownersname;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getComeinAccount() {
        return comeinAccount;
    }

    public void setComeinAccount(String comeinAccount) {
        this.comeinAccount = comeinAccount;
    }

    public String getOwnersname() {
        return ownersname;
    }

    public void setOwnersname(String ownersname) {
        this.ownersname = ownersname;
    }

    @Override
    public String toString() {
        return "ImprotTelephoneNumber{" +
                "userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creatTime=" + creatTime +
                ", comeinAccount='" + comeinAccount + '\'' +
                ", ownersname='" + ownersname + '\'' +
                '}';
    }
}
