package com.cwg.designpattern.composite;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 22:17
 * Compose objects into tree structures to represent part-whole hierarchies.Composite lets clients treat individual objects and compositions of objects uniformly.
 *
 * @author 曹文岗
 **/
public class CompositeTest {

    @Test
    public void composite(){
        Composite root = new Composite("root");
        Component node1 = new Leaf("1");
        Component node2 = new Composite("2");
        Component node3 = new Leaf("3");
        root.add(node1);
        root.add(node2);
        root.add(node3);

        Component node21 = new Leaf("21");
        Component node22 = new Composite("22");

        node2.add(node21);
        node2.add(node22);
        Component node221 = new Leaf("221");
        node22.add(node221);

        root.print();
    }
}
