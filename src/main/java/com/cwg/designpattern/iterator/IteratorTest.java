package com.cwg.designpattern.iterator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 创建时间：2019-10-26 22:06
 * Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
 *
 * @author 曹文岗
 **/
@Slf4j
public class IteratorTest {

    @Test
    public void iterator(){

        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            log.info("{}", iterator.next());
        }
    }
}
