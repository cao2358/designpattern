package com.cwg.designpattern.decorator;

/**
 * 创建时间：2019-10-26 21:38
 *
 * @author 曹文岗
 **/
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
