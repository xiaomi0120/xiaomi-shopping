package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by xiaohuang on 2017/11/9.
 */


/*
һ������ֶΣ�  �������������߰���������
has-a  ��ϵĹ�ϵ  ������ĳ�Ա���ֶΣ�
is-a   �̳еĹ�ϵ
like-a �ӿں�ʵ����֮��Ĺ�ϵ

//���л� ���� �ڴ��еĶ���־û����ߴ��䵽���ʱ��Ҫ�Զ����Ƶ���ʽ���䣩
Serializable


*/

public class Product implements Serializable {
    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productType;
    private Timestamp productCreateTime;
    private ProductDetail productDetail;
    //    one to one   һ����Ʒ��Ӧһ��������Ϣ
    private ProductShelf productShelf;
    //      һ����Ʒ��Ӧһ�������Ϣ
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
