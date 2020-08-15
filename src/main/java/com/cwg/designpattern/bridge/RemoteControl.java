package com.cwg.designpattern.bridge;

/**
 * 创建时间：2019-10-27 11:31
 *
 * @author 曹文岗
 **/
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
