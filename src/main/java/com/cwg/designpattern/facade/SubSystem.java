package com.cwg.designpattern.facade;

/**
 * 创建时间：2019-10-26 22:36
 *
 * @author 曹文岗
 **/
public class SubSystem {

    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void startWatching(){
        System.out.println("startWatching()");
    }
}
