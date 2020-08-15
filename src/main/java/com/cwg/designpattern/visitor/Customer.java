package com.cwg.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建时间：2019-10-27 10:56
 *
 * @author 曹文岗
 **/
public class Customer implements Element {

    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }

    void addOrder(Order order){
        orders.add(order);
    }

    String getName(){
        return name;
    }
}
