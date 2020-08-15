package com.cwg.designpattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 10:31
 * 工厂
 * @author 曹文岗
 **/
@Slf4j
public abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
        log.info("product is: {}", product);
    }
}
