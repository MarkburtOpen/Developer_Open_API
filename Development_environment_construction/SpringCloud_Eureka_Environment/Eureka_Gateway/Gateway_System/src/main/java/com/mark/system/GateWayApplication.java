package com.mark.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/31
 * @TIME: 上午 01:01
 * @YEAR: 2020
 * @Version :
 **/
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {

    public static void main(String[] args) {

        SpringApplication.run(GateWayApplication.class,args);
    }

    @Bean
    public KeyResolver ipKeyResolver(){
        return new KeyResolver() {
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {
                return Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
            }
        };
    }
}
