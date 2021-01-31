package com.hasika.cloud.layui.service.entity;

import lombok.Data;

/**
 * @author long
 * @create 2021-01-31 16:37
 */
@Data
public class ProductCategory {
    private Integer id;
    private String name;
    private Integer parentId;
}
