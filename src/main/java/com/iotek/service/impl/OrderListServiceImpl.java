package com.iotek.service.impl;

import com.iotek.dao.OrderListDao;
import com.iotek.po.OrderList;
import com.iotek.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaohuang on 2017/12/15.
 */
@Service(value = "orderListService")
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    private OrderListDao orderListDao;

    @Override
    public boolean add(OrderList orderList) {
        return false;
    }

    @Override
    public boolean delete(OrderList orderList) {
        return false;
    }

    @Override
    public boolean update(OrderList orderList) {
        return false;
    }

    @Override
    public OrderList query(OrderList orderList) {
        return orderListDao.query(orderList);
    }

    @Override
    public List<OrderList> queryAll() {
        return null;
    }
}
