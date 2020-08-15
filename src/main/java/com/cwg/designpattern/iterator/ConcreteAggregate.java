package com.cwg.designpattern.iterator;

/**
 * 创建时间：2019-10-26 21:58
 *
 * @author 曹文岗
 **/
public class ConcreteAggregate implements Aggregate {
    private Integer[] items;

    public ConcreteAggregate(){
        items = new Integer[10];
        for(int i = 0, len = items.length; i < len; i++){
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<>(items);
    }
}
