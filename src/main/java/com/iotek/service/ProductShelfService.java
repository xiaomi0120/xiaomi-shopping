package com.iotek.service;

import com.iotek.po.ProductShelf;

/**
 * Created by xiaohuang on 2017/12/18.
 */
public interface ProductShelfService extends BaseService<ProductShelf> {

    //    上架商品的方法
    boolean upShelf(ProductShelf productShelf);
}
