package com.hasika.cloud.layui.service.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author long
 * @create 2021-01-31 17:35
 */
@Data
public class ProductVo {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private String categoryOne;
    private String categoryTwo;
}
