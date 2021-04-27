package com.bencaojc.pojo;

import java.io.Serializable;
import java.util.Date;

public class AotianCustomer implements Serializable {
    private String aotianId;

    private String name;

    private String descStr;

    private String telephone;

    private String orderNum;

    private Date creatTime;

    private String customerServiceId;

    private String customerService;

    private String customerType;

    private String customerGrade;

    private String workingGroup;

    private String remark;

    private String province;

    private String city;

    private String county;

    private String detailedAddress;

    private String processingStatus;

    private Date allocateTime;

    private String media;

    private String product;

    private String mediaProduct;

    private String department;

    @Override
    public String toString() {
        return "AotianCustomer{" +
                "aotianId='" + aotianId + '\'' +
                ", name='" + name + '\'' +
                ", descStr='" + descStr + '\'' +
                ", telephone='" + telephone + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", creatTime=" + creatTime +
                ", customerServiceId='" + customerServiceId + '\'' +
                ", customerService='" + customerService + '\'' +
                ", customerType='" + customerType + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", workingGroup='" + workingGroup + '\'' +
                ", remark='" + remark + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", processingStatus='" + processingStatus + '\'' +
                ", allocateTime=" + allocateTime +
                ", media='" + media + '\'' +
                ", product='" + product + '\'' +
                ", mediaProduct='" + mediaProduct + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getAotianId() {
        return aotianId;
    }

    public void setAotianId(String aotianId) {
        this.aotianId = aotianId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescStr() {
        return descStr;
    }

    public void setDescStr(String descStr) {
        this.descStr = descStr;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getCustomerServiceId() {
        return customerServiceId;
    }

    public void setCustomerServiceId(String customerServiceId) {
        this.customerServiceId = customerServiceId;
    }

    public String getCustomerService() {
        return customerService;
    }

    public void setCustomerService(String customerService) {
        this.customerService = customerService;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String getWorkingGroup() {
        return workingGroup;
    }

    public void setWorkingGroup(String workingGroup) {
        this.workingGroup = workingGroup;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public Date getAllocateTime() {
        return allocateTime;
    }

    public void setAllocateTime(Date allocateTime) {
        this.allocateTime = allocateTime;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getMediaProduct() {
        return mediaProduct;
    }

    public void setMediaProduct(String mediaProduct) {
        this.mediaProduct = mediaProduct;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}