package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by xiaohuang on 2017/11/13.
 */
public class Address implements Serializable {
    private Long id;
    private String province;
    private String city;
    private String country;
    private String road;
    private Long customerId;
    private Timestamp addressCreateTime;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Timestamp getAddressCreateTime() {
        return addressCreateTime;
    }

    public void setAddressCreateTime(Timestamp addressCreateTime) {
        this.addressCreateTime = addressCreateTime;
    }


    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", road='" + road + '\'' +
                ", customerId=" + customerId +
                ", addressCreateTime=" + addressCreateTime +
                '}';
    }
}
