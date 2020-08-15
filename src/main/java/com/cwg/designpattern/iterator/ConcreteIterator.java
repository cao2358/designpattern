package com.cwg.designpattern.iterator;

/**
 * 创建时间：2019-10-26 22:02
 *
 * @author 曹文岗
 **/
public class ConcreteIterator<T> implements Iterator {

    private T[] items;
    private int position = 0;

    public ConcreteIterator(T[] items){
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }
}
