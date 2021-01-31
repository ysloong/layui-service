package com.hasika.cloud.layui.service.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author long
 * @create 2021-01-31 17:25
 */
@SpringBootTest
class ProductCategoryMapperTest {


    @Resource
    private ProductCategoryMapper productCategoryMapper;

    @Test
    void test1(){

        QueryWrapper query = new QueryWrapper();
        query.eq("id",5004);

        System.out.println(productCategoryMapper.selectOne(query));
    }

}