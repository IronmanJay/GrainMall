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
 * 2、细节
 *   1)、命名空间：配置隔离
 *       默认：public（保留空间），默认新增的所有配置都在public空间
 *       ①：开发、测试、生产：利用命名空间来做环境隔离
 *          注意：在bootstrap.properties配置，需要使用哪个命名空间的配置就写上哪个命名空间的ID
 *       ②：每一个微服务之间互相隔离配置：每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *   2）、配置集：所有的配置的集合
 *   3）、配置集ID：类似文件名，比如Data Id
 *   4）、配置分组：默认所有的配置集都属于DEFAULT_GROUP
 *   5)、每个微服务创建自己的命名空间，使用配置分组区分环境，比如dev、test、prop
 * 3、同时加载多个配置集
 *   1）、微服务任何配置信息，任何配置文件都可以放在配置中心中
 *   2）、只需要在bootstrap.properties中说明加载配置中心中哪些配置文件即可
 *   3）、以前SpringBoot的任何方式（例如@Value，@ConfigurationProperties）从配置文件中获取值，都能使用
 *   注：配置中心有的优先使用配置中心中的
 */

@EnableDiscoveryClient
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}