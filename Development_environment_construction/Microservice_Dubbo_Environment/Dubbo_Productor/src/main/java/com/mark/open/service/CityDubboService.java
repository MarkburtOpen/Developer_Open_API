package com.mark.open.service;

import com.mark.open.domain.City;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/30
 * @TIME: 上午 02:04
 * @YEAR: 2020
 * @Version :
 **/
public interface CityDubboService {

    /***
     * 根据城市名称，查询城市信息
     * @param cityName
     * @return
     */
    City findCityByName(String cityName);
}
