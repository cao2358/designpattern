package com.cwg.designpattern.bridge;

import org.junit.Test;

/**
 * 创建时间：2019-10-27 11:29
 * Decouple an abstraction from its implementation so that the two can vary independently.
 *
 * @author 曹文岗
 **/
public class BridgeTest {
    @Test
    public void bridge(){
        RemoteControl remoteControl1 = new ConcreteRemoteControl1(new RCA());
        remoteControl1.on();
        remoteControl1.off();
        remoteControl1.tuneChannel();
        RemoteControl remoteControl2 = new ConcreteRemoteControl2(new Sony());
        remoteControl2.on();
        remoteControl2.off();
        remoteControl2.tuneChannel();
    }
}
