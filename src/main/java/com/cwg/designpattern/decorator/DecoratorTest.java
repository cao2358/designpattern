package com.cwg.designpattern.decorator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 创建时间：2019-10-26 21:40
 * Attach additional responsibilities to an object dynamically keeping the same interface.Decorators provide a flexible alternative to subclassing for extending functionality
 *
 * @author 曹文岗
 **/
@Slf4j
public class DecoratorTest {
    @Test
    public void decorator(){
        Beverage beverage = new HouseBlend();

        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);

        log.info("cost is: {}", beverage.cost());
    }
}
