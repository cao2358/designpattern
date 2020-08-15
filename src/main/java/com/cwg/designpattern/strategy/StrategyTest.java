package com.cwg.designpattern.strategy;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 21:48
 * Define a family of algorithms,encapsulate each one,and make them interchangeable.
 *
 * @author 曹文岗
 **/
public class StrategyTest {

    @Test
    public void strategy(){
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();

        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
