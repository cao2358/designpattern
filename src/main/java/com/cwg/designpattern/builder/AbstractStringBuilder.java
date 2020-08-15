package com.cwg.designpattern.builder;

import java.util.Arrays;

/**
 * 创建时间：2019-10-26 13:59
 *
 * @author 曹文岗
 **/
public class AbstractStringBuilder {
    protected char[] value;
    protected int count;

    public AbstractStringBuilder(int capacity){
        this.count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c){
        ensureCapacityInternal(count + 1);
        value[count++] = c;

        return this;
    }

    private void ensureCapacityInternal(int minimumCapacity) {
        if(minimumCapacity -value.length > 0){
            expandCapacity(minimumCapacity);
        }
    }

    private void expandCapacity(int minimumCapacity) {
        int newCapacity = value.length * 2 + 2;
        if(newCapacity - minimumCapacity < 0){
            newCapacity = minimumCapacity;
        }

        if(newCapacity < 0){
            if(minimumCapacity < 0){
                throw new OutOfMemoryError();
            }

            newCapacity = Integer.MAX_VALUE;
        }

        value = Arrays.copyOf(value, newCapacity);
    }
}
