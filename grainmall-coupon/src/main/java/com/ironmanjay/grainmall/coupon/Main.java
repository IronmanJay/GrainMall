package com.ironmanjay.grainmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用Nacos作为配置中心统一管理配置
 *   1）、引入依赖
 *   2）、创建一个bootstrap.properties文件并对其进行配置
 *   3）、需要给配置中心默认添加一个数据集（Data ID），其命名规则为：应用名.properties
 *   4）、给数据集添加任何配置
 *   5）、动态获取配置
 *       ①、@RefreshScope：动态获取并刷新配置
 *       ②、@Value("${配置项的名称}")：获取到的配置
 *       注：如果配置中心和当前应用的配置文件（application.properties）中都配置了相同的项，优先使用配置中心的配置
 */

@EnableDiscoveryClient
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}