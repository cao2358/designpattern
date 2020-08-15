package com.cwg.designpattern.factory;

/**
 * 创建时间：2019-10-26 10:47
 *
 * @author 曹文岗
 **/
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB1();
    }
}
