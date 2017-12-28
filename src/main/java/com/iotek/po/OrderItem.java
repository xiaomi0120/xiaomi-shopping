package com.iotek.po;

import java.io.Serializable;

/**
 * Created by xiaohuang on 2017/12/22.
 */
public class OrderItem implements Serializable {
    private Long id;
    private String itemNO;
    private Long orderListId;
    private Long productId;
    private Integer productNumber;
    private Integer isSendOut;
    private Long addressId;
    private String orderItemState;
    private Product product;


    public OrderItem() {
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getItemNO() {
        return itemNO;
    }

    public void setItemNO(String itemNO) {
        this.itemNO = itemNO;
    }

    public Long getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(Long orderListId) {
        this.orderListId = orderListId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getIsSendOut() {
        return isSendOut;
    }

    public void setIsSendOut(Integer isSendOut) {
        this.isSendOut = isSendOut;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public String getOrderItemState() {
        return orderItemState;
    }

    public void setOrderItemState(String orderItemState) {
        this.orderItemState = orderItemState;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productId=" + productId +
                ", id=" + id +
                ", orderListId=" + orderListId +
                ", itemNO='" + itemNO + '\'' +
                ", productNumber=" + productNumber +
                ", isSendOut=" + isSendOut +
                ", addressId=" + addressId +
                '}';
    }
}
