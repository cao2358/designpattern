package com.cwg.designpattern.decorator;

/**
 * 创建时间：2019-10-26 21:37
 *
 * @author 曹文岗
 **/
public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
