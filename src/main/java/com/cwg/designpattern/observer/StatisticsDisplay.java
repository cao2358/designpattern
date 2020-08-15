package com.cwg.designpattern.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 22:28
 *
 * @author 曹文岗
 **/
@Slf4j
public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        log.info("StatisticsDisplay.update {} {} {}", temp, humidity, pressure);
    }
}
