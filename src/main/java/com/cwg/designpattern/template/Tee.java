package com.cwg.designpattern.template;

/**
 * 创建时间：2019-10-26 11:09
 *
 * @author 曹文岗
 **/
public class Tee extends MakingBeverage {
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
