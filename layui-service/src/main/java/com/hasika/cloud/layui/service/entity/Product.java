package com.hasika.cloud.layui.service.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author long
 * @create 2021-01-31 16:33
 */
@Data
public class Product {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private Integer categoryOneId;
    private Integer categoryTwoId;
}
