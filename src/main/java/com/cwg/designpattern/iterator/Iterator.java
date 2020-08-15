package com.cwg.designpattern.iterator;

/**
 * 创建时间：2019-10-26 22:01
 *
 * @author 曹文岗
 **/
public interface Iterator<T> {
    T next();

    boolean hasNext();
}
