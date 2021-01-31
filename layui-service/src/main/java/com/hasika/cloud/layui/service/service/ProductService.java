package com.hasika.cloud.layui.service.service;

import com.hasika.cloud.layui.service.entity.Product;
import com.hasika.cloud.layui.service.vo.DataVo;

/**
 * 产品
 *
 * @author long
 * @create 2021-01-31 17:30
 */
public interface ProductService {


    /**
     * 查找产品数据
     *
     * @return 返回数据
     */
    DataVo<Product> findData();
}
