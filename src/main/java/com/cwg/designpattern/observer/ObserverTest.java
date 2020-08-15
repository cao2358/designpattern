package com.cwg.designpattern.observer;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 22:22
 * Define a one-to-many dependency between objects so that when one object changes state,all its dependents are notified and updated automatically.
 *
 * @author 曹文岗
 **/
public class ObserverTest {

    @Test
    public void observer() {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);
    }
}
