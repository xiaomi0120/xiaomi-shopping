package com.iotek.po;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by xiaohuang on 2017/11/13.
 */
public class InnerStock implements Serializable {
    private Long id;
    private Long productId;
    private Integer innerStockNumber;
    private Timestamp innerStockTime;

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

    public Integer getInnerStockNumber() {
        return innerStockNumber;
    }

    public void setInnerStockNumber(Integer innerStockNumber) {
        this.innerStockNumber = innerStockNumber;
    }

    public Timestamp getInnerStockTime() {
        return innerStockTime;
    }

    public void setInnerStockTime(Timestamp innerStockTime) {
        this.innerStockTime = innerStockTime;
    }

    public InnerStock() {

    }

    @Override
    public String toString() {
        return "InnerStock{" +
                "id=" + id +
                ", productId=" + productId +
                ", innerStockNumber=" + innerStockNumber +
                ", innerStockTime=" + innerStockTime +
                '}';
    }
}
