package com.cwg.designpattern.observer;

/**
 * 创建时间：2019-10-26 22:25
 *
 * @author 曹文岗
 **/
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
