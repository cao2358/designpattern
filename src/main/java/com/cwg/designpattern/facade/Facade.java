package com.cwg.designpattern.facade;

/**
 * 创建时间：2019-10-26 22:37
 *
 * @author 曹文岗
 **/
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTV();
        subSystem.setCD("movie");
        subSystem.startWatching();
    }
}
