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
//  Ĭ��ͨ��������ӳ��
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
            //����
            productShelfDao.add(productShelf);

        } else {
            //  ������� ����
            productShelfDao.update(productShelf);
        }
        return true;


        /*
//        �ж���Ʒ�Ƿ����ϼܼ�¼
//        ����� �Ѿ��ϼ�  ���� false �����ϼܼ�¼
//        ���û��  ����
        if (productShelf == null) {
            return false;
        }
        SqlSession session = MybatisSessionFactory.getSession();
        ProductShelfDao shelfDao = session.getMapper(ProductShelfDao.class);
        ProductShelf OldproductShelf = shelfDao.query(productShelf);
        try {
            if (OldproductShelf == null) {
                //����
                shelfDao.add(productShelf);
            } else {
                //  ������� ����
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
