package com.cwg.designpattern.mediator;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 14:39
 * Define an object that encapsulates how a set of objects interact.Mediator promotes loose coupling by keeping objects from referring to each other explicitly,and it lets you vary their interaction independently.
 *
 * @author 曹文岗
 **/
public class MediatorTest {

    @Test
    public void mediator(){
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calender calender = new Calender();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm, coffeePot, calender, sprinkler);
        // 闹钟事件到达，调用中介者就可以操作相关对象
        alarm.onEvent(mediator);
    }
}
