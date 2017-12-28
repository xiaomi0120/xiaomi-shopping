package com.iotek.service.impl;

import com.iotek.dao.ProductStockDao;
import com.iotek.po.ProductStock;
import com.iotek.service.ProductStockService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by xiaohuang on 2017/12/18.
 */
public class ProductStockServiceImpl implements ProductStockService {

    @Override
    public boolean add(ProductStock productStock) {
        return false;
    }

    @Override
    public boolean delete(ProductStock productStock) {
        return false;
    }

    @Override
    public boolean update(ProductStock productStock) {
        return false;
    }

    @Override
    public ProductStock query(ProductStock productStock) {
      /*  SqlSession session = MybatisSessionFactory.getSession();
        ProductStockDao productStockDao = session.getMapper(ProductStockDao.class);
        productStock = productStockDao.query(productStock);
          MybatisSessionFactory.close();*/
        return null;
    }

    @Override
    public List<ProductStock> queryAll() {
        return null;
    }
}
