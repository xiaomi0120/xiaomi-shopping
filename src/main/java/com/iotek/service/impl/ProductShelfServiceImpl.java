package com.iotek.service.impl;

import com.iotek.dao.ProductShelfDao;
import com.iotek.po.ProductShelf;
import com.iotek.service.ProductShelfService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xiaohuang on 2017/12/18.
 */

@Service
@Transactional
public class ProductShelfServiceImpl implements ProductShelfService {
    @Autowired
//  默认通过类型来映射
    private ProductShelfDao productShelfDao;

    @Override
    public boolean add(ProductShelf productShelf) {
        return false;
    }

    @Override
    public boolean delete(ProductShelf productShelf) {
        return false;
    }

    @Override
    public boolean update(ProductShelf productShelf) {
        return false;
    }

    @Override
    public ProductShelf query(ProductShelf productShelf) {
        return null;
    }

    @Override
    public List<ProductShelf> queryAll() {
        return null;
    }

    @Override
    public boolean upShelf(ProductShelf productShelf) {
        if (productShelf == null) {
            return false;
        }
        ProductShelf OldproductShelf = productShelfDao.query(productShelf);
        if (OldproductShelf == null) {
            //增加
            productShelfDao.add(productShelf);

        } else {
            //  如果存在 更新
            productShelfDao.update(productShelf);
        }
        return true;


        /*
//        判断商品是否有上架记录
//        如果有 已经上架  返回 false 更新上架记录
//        如果没有  更新
        if (productShelf == null) {
            return false;
        }
        SqlSession session = MybatisSessionFactory.getSession();
        ProductShelfDao shelfDao = session.getMapper(ProductShelfDao.class);
        ProductShelf OldproductShelf = shelfDao.query(productShelf);
        try {
            if (OldproductShelf == null) {
                //增加
                shelfDao.add(productShelf);
            } else {
                //  如果存在 更新
                shelfDao.update(productShelf);
            }
            session.commit();
            return true;
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
            return false;
        } finally {
            MybatisSessionFactory.close();
        }
*/

    }
}
