package com.cwg.designpattern.bridge;

/**
 * 创建时间：2019-10-27 11:30
 *
 * @author 曹文岗
 **/
public class Sony extends TV {
    @Override
    public void on() {
        System.out.println("Sony.on()");
    }

    @Override
    public void off() {
        System.out.println("Sony.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony.tuneChannel()");
    }
}
