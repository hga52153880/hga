package com.ctyun.service;

import javax.jws.WebService;

/**
 * @author hga
 * @date 2019-08-06 16:18
 */
@WebService   //webservice 表示当前服务是一个webservice服务
public interface WeatherService {
        String getWeather(String name);

}