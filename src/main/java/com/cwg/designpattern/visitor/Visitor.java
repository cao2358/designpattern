package com.cwg.designpattern.visitor;

/**
 * 创建时间：2019-10-27 10:56
 *
 * @author 曹文岗
 **/
public interface Visitor {
    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
