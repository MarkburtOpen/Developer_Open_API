package com.mark.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Markburt
 * @Description :Eureka注册中心启动方法
 * @DATE: 2020/3/30
 * @TIME: 下午 03:56
 * @YEAR: 2020
 * @Version :
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
