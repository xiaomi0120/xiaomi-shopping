package com.iotek.dao;

import com.iotek.po.Customer;

/**
 * Created by xiaohuang on 2017/12/13.
 */
public interface CustomerDao extends BaseDao<Customer> {
    //      ��ѯ�û���ַ
    Customer queryCustomerAddress(Customer customer);

}
