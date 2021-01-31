package com.hasika.cloud.layui.service.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author long
 * @create 2021-01-31 17:13
 */
@SpringBootTest
class ProductMapperTest {

    @Resource
    private ProductMapper productMapper;


    @Test
    void test() {
        productMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void findProductDetailList() {
        productMapper.findProductDetailList().forEach(System.out::println);
    }
}