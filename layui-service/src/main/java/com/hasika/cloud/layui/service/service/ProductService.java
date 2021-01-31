package com.hasika.cloud.layui.service.service;

import com.hasika.cloud.layui.service.entity.Product;
import com.hasika.cloud.layui.service.vo.DataVo;
import com.hasika.cloud.layui.service.vo.ProductDetailVo;

import java.util.List;

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

    /**
     * 查询列表详情
     * @return 详情
     */
    List<ProductDetailVo> findProductDetailList();
}
