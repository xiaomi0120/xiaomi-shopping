package com.iotek.dao;

import com.iotek.po.OrderItem;
import com.iotek.po.OrderList;

import java.util.List;

/**
 * Created by xiaohuang on 2017/12/22.
 */
public interface OrderItemDao extends BaseDao<OrderItem> {

    /*
    * ͨ������id��ѯ�Ӷ���
    *
    * */
    List<OrderItem> queryOrderItemByOLID(OrderList orderList);
}
