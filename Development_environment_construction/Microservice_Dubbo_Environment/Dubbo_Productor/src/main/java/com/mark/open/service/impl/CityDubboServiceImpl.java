package com.mark.open.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mark.open.domain.City;
import com.mark.open.service.CityDubboService;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/30
 * @TIME: 上午 02:05
 * @YEAR: 2020
 * @Version :
 **/

@Service
public class CityDubboServiceImpl  implements CityDubboService {
    @Override
    public City findCityByName(String cityName) {
       City cieyname= new City(1L,2L,"重庆","我的故乡");
        return cieyname;
    }
}
