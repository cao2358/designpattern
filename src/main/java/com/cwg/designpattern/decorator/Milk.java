package com.cwg.designpattern.decorator;

/**
 * 创建时间：2019-10-26 21:38
 *
 * @author 曹文岗
 **/
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
