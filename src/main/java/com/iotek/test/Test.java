package com.iotek.test;


import com.iotek.po.*;
import com.iotek.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by xiaohuang on 2017/12/13.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
//         通过id查询用户

       /* Customer customer=new Customer();
        customer.setId(53L);
        customer = customerService.query(customer);
        System.out.println(customer);*/

//       通过用户名和密码查询

/*
        Customer customer=new Customer();
        customer.setCustomerName("小黄");
        customer.setCustomerPassword("123456");
        customer = customerService.query(customer);
        System.out.println(customer);*/


        //  注册用户
      /*  ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService= (CustomerService) context.getBean("customerService");
        Customer customer=new Customer();
        customer.setCustomerName("王五");
        customer.setCustomerPassword("12345678");
        customer.setCustomerEmail("12345678@qq.com");
        customer.setCustomerPhone("12345678");
        customerService.registerCustomer(customer);*/

//          修改用户密码
/*        Customer customer=new Customer();
        customer.setCustomerName("小黄");
        customer.setCustomerPassword("123456");
        customer = customerService.query(customer);
        System.out.println(customer);
        customer.setCustomerPassword("12345678999");
        customerService.update(customer);
        Customer query = customerService.query(customer);
        System.out.println(query);*/
        Customer customer = new Customer();
        customer.setCustomerName("xiaohuang");
        customer.setCustomerPassword("1234567");
        customer = customerService.query(customer);
        System.out.println(customer);


        List<Address> addressList = customer.getAddressList();
        for (Address address : addressList) {
            System.out.println(address);
        }
        System.out.println("************************************");

        List<OrderList> orderLists = customer.getOrderLists();
        OrderList orderList1 = null;
        for (OrderList orderList : orderLists) {
            if (orderList.getId() == 9) {
                orderList1 = orderList;
            }
        }

        List<OrderItem> orderItemList = orderList1.getOrderItemList();
        OrderItem orderItem1 = null;

        for (OrderItem orderItem : orderItemList) {

            System.out.println("=++++++++++++++》》》" + orderItem);
            if (orderItem.getId() == 23) {
                orderItem1 = orderItem;
            }
        }
        Product product = orderItem1.getProduct();
        System.out.println(product);
        ProductDetail productDetail = product.getProductDetail();
        System.out.println(productDetail);
        ProductShelf productShelf = product.getProductShelf();
        System.out.println(productShelf);
        ProductStock productStock = product.getProductStock();
        System.out.println(productStock);


    }


}
