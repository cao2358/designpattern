package com.cwg.designpattern.adapter;


import org.junit.Test;

/**
 * 创建时间：2019-10-26 21:55
 * Convert the interface of a class into another interface clients expect.Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 *
 * @author 曹文岗
 **/
public class AdapterTest {
    @Test
    public void adapter(){
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);

        duck.quack();
    }
}
