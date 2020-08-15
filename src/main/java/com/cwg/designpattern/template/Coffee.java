package com.cwg.designpattern.template;

/**
 * 创建时间：2019-10-26 11:09
 *
 * @author 曹文岗
 **/
public class Coffee extends MakingBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
