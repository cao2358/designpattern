package com.cwg.designpattern.command;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 14:52
 * Encapsulate a request as an object,thereby letting you parameterize clients with different requests,queue or log requests,and support undoable operations.
 *
 * @author 曹文岗
 **/
public class CommandTest {

    @Test
    public void command(){
        Invoker invoker = new Invoker();
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        invoker.setOnCommand(lightOnCommand, 0);
        invoker.setOffCommand(lightOffCommand, 0);

        invoker.onButtonPushed(0);
        invoker.offButtonPushed(0);
    }
}
