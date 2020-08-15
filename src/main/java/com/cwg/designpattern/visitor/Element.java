package com.cwg.designpattern.visitor;

/**
 * 创建时间：2019-10-27 10:55
 *
 * @author 曹文岗
 **/
public interface Element {
    void accept(Visitor visitor);
}
