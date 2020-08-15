package com.cwg.designpattern.observer;

/**
 * 创建时间：2019-10-26 22:24
 *
 * @author 曹文岗
 **/
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
