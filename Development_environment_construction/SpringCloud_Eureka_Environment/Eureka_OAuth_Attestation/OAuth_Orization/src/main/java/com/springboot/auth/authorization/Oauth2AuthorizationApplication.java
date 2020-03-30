package com.springboot.auth.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/30
 * @TIME: 下午 11:19
 * @YEAR: 2020
 * @Version :
 **/

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Oauth2AuthorizationApplication {
    public static void main(String[] args) {

        SpringApplication.run(Oauth2AuthorizationApplication.class, args);
    }
}
