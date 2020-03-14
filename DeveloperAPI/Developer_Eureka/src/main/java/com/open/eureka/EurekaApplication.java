package com.open.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description :  java类作用描述
 * @Author :  Markburt
 * @CreateDate :  2020/3/14$ 下午 05:09$
 * @UpdateUser :  Markburt
 * @UpdateDate :  2020/3/14$ 下午 05:09$
 * @UpdateRemark :  Project Build
 * @Version :  1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    //psvm==main 访问地址：http://localhost:8080/
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class);
    }
}
