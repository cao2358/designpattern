package com.cwg.designpattern.command;

/**
 * 创建时间：2019-10-26 14:46
 *
 * @author 曹文岗
 **/
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
