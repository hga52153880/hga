package com.ctyun.service;

/**
 * @author hga
 * @date 2019-08-06 16:21
 */

public class WeatherServiceImpl implements WeatherService {
    @Override
    public String getWeather(String name) {
        if ("北京".equals(name)){
            return "暴雨";
        }else    if ("山东".equals(name)){
            return "阵雨";
        }else    if ("广东".equals(name)){
            return "暴雨";
        }else    if ("上海".equals(name)){
            return "晴";
        }else    if ("河北".equals(name)){
            return "干旱";
        }else{
            return "对不起,暂时没有" + name + "的信息";
        }

    }
}