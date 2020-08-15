package com.cwg.designpattern.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 创建时间：2019-10-26 10:27
 *
 * @author 曹文岗
 **/
@Slf4j
public class FactoryTest {

    @Test
    public void simple(){
        Product product = SimpleFactory.createProduct("A");
        assert product != null;
        log.info("name is: {}", product.getName());

        product = SimpleFactory.createProduct("B");
        assert product != null;
        log.info("name is: {}", product.getName());
    }

    @Test
    public void factory(){
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();

        log.info("name is: {}", product.getName());
    }

    @Test
    public void abstractFactory(){
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createAbstractProductA();
        AbstractProductB productB = abstractFactory.createAbstractProductB();
        log.info("productA name is: {}, productB name is: {}", productA.getName(), productB.getName());
    }
}
