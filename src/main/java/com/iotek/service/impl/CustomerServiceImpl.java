package com.iotek.service.impl;

import com.iotek.dao.CustomerDao;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by xiaohuang on 2017/12/14.
 */

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public boolean add(Customer customer) {
        boolean add = customerDao.add(customer);
        return add;
    }

    @Override
    public boolean delete(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        throwNull(customer);

        return customerDao.update(customer);
    }

    @Override
    public Customer query(Customer customer) {

        return customerDao.query(customer);
    }

    @Override
    public List<Customer> queryAll() {
        return null;
    }

    @Override
    public boolean registerCustomer(Customer customer) {

        return add(customer);
    }

    @Override
    public Customer queryCustomerAddress(Customer customer) {
        throwNull(customer);


        return customerDao.queryCustomerAddress(customer);
    }

    public void throwNull(Customer customer) {
        if (customer == null) {
            throw new NullPointerException("customer is not null");
        }
    }

}
