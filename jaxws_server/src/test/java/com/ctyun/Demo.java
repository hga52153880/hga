package com.ctyun;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author hga
 * @date 2019-08-06 16:24
 */
public class Demo {


    public static void main(String[] args) {
        //创建saxws对象
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        //暴露访问地址
        factoryBean.setAddress("http://localhost/31415/weather");

        //设置服务类对象
        factoryBean.setServiceBean(new WeatherServiceImpl());
        //创建服务
        factoryBean.create();
    }
}