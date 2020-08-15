package com.cwg.designpattern.factory;

/**
 * 创建时间：2019-10-26 10:33
 *
 * @author 曹文岗
 **/
public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        Product product = new ConcreteProductA();
        product.setName("concreteProductA");

        return product;
    }
}
