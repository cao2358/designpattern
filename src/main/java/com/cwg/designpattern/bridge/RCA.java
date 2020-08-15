package com.cwg.designpattern.bridge;

/**
 * 创建时间：2019-10-27 11:30
 *
 * @author 曹文岗
 **/
public class RCA extends TV {
    @Override
    public void on() {
        System.out.println("RCA.on()");
    }

    @Override
    public void off() {
        System.out.println("RCA.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("RCA.tuneChannel()");
    }
}
