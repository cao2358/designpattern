package com.cwg.designpattern.flyweight;

import org.junit.Test;

/**
 * 创建时间：2019-10-27 11:24
 * Use sharing to support large numbers of fine-grained objects efficiently.
 *
 * @author 曹文岗
 **/
public class FlyweightTest {

    @Test
    public void flyweight(){
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("aa");
        Flyweight flyweight2 = factory.getFlyweight("aa");
        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
    }
}
