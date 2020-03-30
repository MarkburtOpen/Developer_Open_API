package com.mark.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/31
 * @TIME: 上午 01:07
 * @YEAR: 2020
 * @Version :
 **/
@SpringBootApplication
@EnableEurekaClient
public class WebGatewayApplication {
    public static void main(String[] args) {

        SpringApplication.run(WebGatewayApplication.class,args);
    }
}
