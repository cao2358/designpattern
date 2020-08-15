package com.cwg.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建时间：2019-10-27 11:26
 *
 * @author 曹文岗
 **/
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<>();

    Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }
}
