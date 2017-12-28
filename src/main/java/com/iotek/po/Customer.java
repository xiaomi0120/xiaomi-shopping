package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by xiaohuang on 2017/11/8.
 */
public class Customer implements Serializable {

    //    �û��˺Ų�����
    public static final Integer NOT_NORMAL = 0;
    //    �û�����
    public static final Integer NORMAL = 1;
    //    �û�δ��¼
    public static final Integer NOT_LOGIND = 0;
    //    �û��ѵ�¼
    public static final Integer LOGIND = 1;

    private Long id;
    private String customerName;
    private String customerPassword;
    private String customerPhone;
    private String customerEmail;
    private BigDecimal customerMoney;
    private Timestamp customerCreateTime;//�û�����ʱ��
    private Integer isNormal; //�û��Ƿ�����
    //    һ���û���Ӧ�����ַ
    private List<Address> addressList;

    private List<OrderList> orderLists;

    public List<OrderList> getOrderLists() {
        return orderLists;
    }

    public void setOrderLists(List<OrderList> orderLists) {
        this.orderLists = orderLists;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public BigDecimal getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(BigDecimal customerMoney) {
        this.customerMoney = customerMoney;
    }


    public Timestamp getCustomerCreateTime() {
        return customerCreateTime;
    }

    public void setCustomerCreateTime(Timestamp customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public Integer getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Integer isNormal) {
        this.isNormal = isNormal;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerMoney=" + customerMoney +
                ", customerCreateTime=" + customerCreateTime +
                ", isNormal=" + isNormal +
                ", addressList=" + addressList +
                ", orderLists=" + orderLists +
                '}';
    }
}
