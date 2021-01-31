package com.hasika.cloud.layui.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shilongyin
 */
@SpringBootApplication
@MapperScan("com.hasika.cloud.layui.service.mapper")
public class LayuiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LayuiServiceApplication.class, args);
	}

}
