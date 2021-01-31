package com.hasika.cloud.layui.service.service.impl;

import com.hasika.cloud.layui.service.entity.Product;
import com.hasika.cloud.layui.service.mapper.ProductMapper;
import com.hasika.cloud.layui.service.service.ProductService;
import com.hasika.cloud.layui.service.vo.DataVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author long
 * @create 2021-01-31 17:40
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Resource
    private ProductMapper productMapper;

    /**
     * 查找产品数据
     *
     * @return 返回数据
     */
    @Override
    public DataVo<Product> findData() {

        DataVo<Product> dataVo = new DataVo<>();
        dataVo.setCode("00");
        dataVo.setMessage("成功");
        dataVo.setCount(productMapper.selectCount(null));
        dataVo.setData(productMapper.selectList(null));

        return dataVo;
    }
}
