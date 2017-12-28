package com.iotek.po;


import java.io.Serializable;

import java.sql.Timestamp;

/**
 * Created by xiaohuang on 2017/11/24.
 */
public class ProductShelf implements Serializable {
    public static Integer UPSHELF = 1;
    public static Integer NOT_UPSHELF = 0;
    private Long id;
    private Long productId;
    private Timestamp operTime;
    private Timestamp shelfCreateTime;
    private Integer isUpShelf;


    public ProductShelf() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }

    public Timestamp getShelfCreateTime() {
        return shelfCreateTime;
    }

    public void setShelfCreateTime(Timestamp shelfCreateTime) {
        this.shelfCreateTime = shelfCreateTime;
    }

    public Integer getIsUpShelf() {
        return isUpShelf;
    }

    public void setIsUpShelf(Integer isUpShelf) {
        this.isUpShelf = isUpShelf;
    }

    @Override
    public String toString() {
        return "ProductShelf{" +
                "id=" + id +
                ", productId=" + productId +
                ", operTime=" + operTime +
                ", shelfCreateTime=" + shelfCreateTime +
                ", isUpShelf=" + isUpShelf +
                '}';
    }
}
