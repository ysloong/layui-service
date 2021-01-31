package com.hasika.cloud.layui.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hasika.cloud.layui.service.entity.Product;
import com.hasika.cloud.layui.service.vo.ProductDetailVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author long
 * @create 2021-01-31 16:58
 */
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * 查询产品详情
     * @return 详情
     */
    @Select("select product.*,product_category.name category_name from product,product_category " +
            "  WHERE product.category_one_id = product_category.id;")
    List<ProductDetailVo> findProductDetailList();
}
