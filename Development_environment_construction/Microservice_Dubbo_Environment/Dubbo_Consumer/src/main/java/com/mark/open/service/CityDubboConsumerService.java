package com.mark.open.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.mark.open.domain.City;
import com.mark.open.domain.User;
import org.springframework.stereotype.Component;

/**
 * 城市 Dubbo 服务消费者
 * <p>
 *
 */
@Component
public class CityDubboConsumerService {

    @Reference
    CityDubboService cityDubboService;

    @Reference
    UserService userService;

    public void printCity() {
        String cityName = "广州";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }


    public User saveUser() {
        User user = new User();
        user.setUsername("jaycekon")
                .setPassword("jaycekong824");
        return userService.saveUser(user);
    }
}
