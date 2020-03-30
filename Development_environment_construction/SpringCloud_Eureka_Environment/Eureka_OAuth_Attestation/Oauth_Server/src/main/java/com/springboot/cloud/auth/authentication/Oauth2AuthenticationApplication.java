package com.springboot.cloud.auth.authentication;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/30
 * @TIME: 下午 10:59
 * @YEAR: 2020
 * @Version :
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCreateCacheAnnotation
public class Oauth2AuthenticationApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2AuthenticationApplication.class, args);
    }
}
