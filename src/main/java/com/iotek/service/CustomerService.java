package com.iotek.service;

import com.iotek.po.Customer;

/**
 * Created by xiaohuang on 2017/12/14.
 */
public interface CustomerService extends BaseService<Customer> {


    //      ע���û�
    boolean registerCustomer(Customer customer);

    Customer queryCustomerAddress(Customer customer);
}
