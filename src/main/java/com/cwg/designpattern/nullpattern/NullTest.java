package com.cwg.designpattern.nullpattern;

import org.junit.Test;

/**
 * 创建时间：2019-10-27 11:35
 *
 * @author 曹文岗
 **/
public class NullTest {

    @Test
    public void nullTest(){

        AbstractOperation abstractOperation = func(1);
        abstractOperation.request();

        abstractOperation = func(-1);
        abstractOperation.request();
    }


    private static AbstractOperation func(int para) {
        if (para < 0) {
            return new NullOperation();
        }
        return new RealOperation();
    }
}
