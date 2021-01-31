package com.hasika.cloud.layui.service.controller;

import com.hasika.cloud.layui.service.entity.Product;
import com.hasika.cloud.layui.service.service.ProductService;
import com.hasika.cloud.layui.service.vo.DataVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author long
 * @create 2021-01-31 17:53
 */

@RestController
public class ProductController {
    @Resource
    private ProductService productService;

    @RequestMapping("/list")
    public DataVo<Product> list() {
        return productService.findData();
    }
}
