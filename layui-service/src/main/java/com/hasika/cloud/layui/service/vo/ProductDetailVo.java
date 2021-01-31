package com.hasika.cloud.layui.service.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author long
 * @create 2021-01-31 22:31
 */
@Data
public class ProductDetailVo {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private String categoryOne;
    private String categoryTwo;
    private String categoryName;
}
