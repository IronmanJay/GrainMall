package com.ironmanjay.grainmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis-Plus
 * 2、配置
 *    1）配置数据源
 *       ①：导入数据库的驱动
 *       ②：配置数据源相关信息
 *    2）配置Mybatis-Plus
 *       ①：使用@MapperScan
 *       ②：告诉Mybatis-Plus，sql映射文件位置
 */

@MapperScan("com.ironmanjay.grainmall.product.dao")
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}