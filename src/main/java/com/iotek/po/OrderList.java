package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by xiaohuang on 2017/11/10.
 */
public class OrderList implements Serializable {
    public static final String ORDERSTATE_NORMAL = "normal";
    public static final String ORDERSTATE_NOT_NORMAL = " not_normal";
    public static final Integer ORDERLIST_PAY = 1;
    public static final Integer ORDERLIST_NOT_PAY = 0;

    private Long id;
    private Long customerId;
    private BigDecimal totalMoney;
    private Timestamp orderCreateTime;
    private String orderState;
    private Integer isPay;
    private List<OrderItem> orderItemList;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Timestamp getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Timestamp orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalMoney=" + totalMoney +
                ", orderCreateTime=" + orderCreateTime +
                ", orderState='" + orderState + '\'' +
                ", isPay=" + isPay +
                '}';
    }
}
