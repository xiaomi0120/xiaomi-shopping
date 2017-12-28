package com.iotek.util;

import com.iotek.po.Customer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by xiaohuang on 2017/11/16.
 */
public class ImageID {
    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        Customer customer = new Customer();
        getS(customer);
        System.out.println(customer);
        System.out.println(customer);
    }

    public static void getS(Customer customer) {
        customer.setCustomerName("asdfas");

    }

    //    时间戳_10位随机数_商品名
    public static String getImageID(String filename) {
        String imageID = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
        imageID = format.format(new Date());

        String nextLong = (Math.abs(random.nextLong()) + "").substring(0, 10);
        return imageID + "_" + nextLong + "_" + filename;

    }
}
