package com.iotek.service;

import com.iotek.po.ProductShelf;

/**
 * Created by xiaohuang on 2017/12/18.
 */
public interface ProductShelfService extends BaseService<ProductShelf> {

    //    �ϼ���Ʒ�ķ���
    boolean upShelf(ProductShelf productShelf);
}
