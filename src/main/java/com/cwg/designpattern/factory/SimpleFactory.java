package com.cwg.designpattern.factory;

/**
 * 创建时间：2019-10-26 10:14
 * 简单工厂: 一个模块仅需要一个工厂类，没有必要把它产生出来，使用静态的方法
 * @author 曹文岗
 **/
public class SimpleFactory {

    public static Product createProduct(String type){

        if(type.equals("A")){
            Product product = new ConcreteProductA();
            product.setName("simpleA");

            return product;
        }

        if(type.equals("B")){
            Product product = new ConcreteProductB();
            product.setName("simpleB");

            return product;
        }

        return null;
    }
}
