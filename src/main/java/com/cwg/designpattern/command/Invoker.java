package com.cwg.designpattern.command;

/**
 * 创建时间：2019-10-26 14:48
 *
 * @author 曹文岗
 **/
public class Invoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private final int slotNum = 7;

    public Invoker(){
        this.onCommands = new Command[slotNum];
        this.offCommands = new Command[slotNum];
    }

    public void setOnCommand(Command command, int slot){
        onCommands[slot] = command;
    }

    public void setOffCommand(Command command, int slot){
        offCommands[slot] = command;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute();
    }

}
