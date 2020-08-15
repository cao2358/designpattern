package com.cwg.designpattern.factory;

/**
 * 创建时间：2019-10-26 10:24
 *
 * @author 曹文岗
 **/
public class ConcreteProductB implements Product {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
