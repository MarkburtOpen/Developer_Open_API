package com.open.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description :  java类作用描述
 * @Author :  Markburt
 * @CreateDate :  2020/3/14$ 下午 03:12$
 * @UpdateUser :  Markburt
 * @UpdateDate :  2020/3/14$ 下午 03:12$
 * @UpdateRemark :  Project Build
 * @Version :  1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class AddressApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressApplication.class,args);
    }
}
