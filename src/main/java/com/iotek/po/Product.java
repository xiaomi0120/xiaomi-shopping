package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by xiaohuang on 2017/11/9.
 */


/*
一个类的字段：  这个类的特征或者包含的内容
has-a  组合的关系  当做类的成员（字段）
is-a   继承的关系
like-a 接口和实现类之间的关系

//序列化 （将 内存中的对象持久化或者传输到外界时需要以二进制的形式传输）
Serializable


*/

public class Product implements Serializable {
    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productType;
    private Timestamp productCreateTime;
    private ProductDetail productDetail;
    //    one to one   一个商品对应一个货架信息
    private ProductShelf productShelf;
    //      一个商品对应一个库存信息
    private ProductStock productStock;

    public ProductShelf getProductShelf() {
        return productShelf;
    }

    public void setProductShelf(ProductShelf productShelf) {
        this.productShelf = productShelf;
    }

    public ProductStock getProductStock() {
        return productStock;
    }

    public void setProductStock(ProductStock productStock) {
        this.productStock = productStock;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Timestamp getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Timestamp productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productType='" + productType + '\'' +
                ", productCreateTime=" + productCreateTime +
                ", productDetail=" + productDetail +
                ", productShelf=" + productShelf +
                ", productStock=" + productStock +
                '}';
    }
}
