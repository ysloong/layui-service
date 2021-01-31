package com.hasika.cloud.layui.service.service;

import com.hasika.cloud.layui.service.entity.Product;
import com.hasika.cloud.layui.service.vo.DataVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author long
 * @create 2021-01-31 17:49
 */
@SpringBootTest
class ProductServiceTest {

    @Resource
    private ProductService productService;

    @Test
    void findData() {

        DataVo<Product> data = productService.findData();
        int i = 0;

    }
}