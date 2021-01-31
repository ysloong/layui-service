package com.hasika.cloud.layui.service.vo;

import lombok.Data;

import java.util.List;

/**
 * @author long
 * @create 2021-01-31 17:32
 */
@Data
public class DataVo<T> {

    private String code;
    private String message;
    private Integer count;
    private List<T> data;
}
