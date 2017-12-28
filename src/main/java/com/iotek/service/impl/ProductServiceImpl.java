package com.iotek.service.impl;

import com.iotek.dao.ProductDao;
import com.iotek.dao.ProductDetailDao;
import com.iotek.po.Product;
import com.iotek.po.ProductDetail;
import com.iotek.service.ProductService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaohuang on 2017/12/14.
 */
@Service(value = "productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;


    /*多个操作在service 实现事务管理*/
    @Override
    public boolean add(Product product) {
        if (product == null) {
            return false;
        }
        return false;

    }

    @Override
    public boolean delete(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public Product query(Product product) {

        return null;
    }

    @Override
    public List<Product> queryAll() {

        return productDao.queryAll();

    }
}
