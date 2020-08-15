package com.cwg.designpattern.visitor;

/**
 * 创建时间：2019-10-27 11:04
 *
 * @author 曹文岗
 **/
public class GeneralReport implements Visitor {

    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    @Override
    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customersNo++;
    }

    @Override
    public void visit(Order order) {
        System.out.println(order.getName());
        ordersNo++;
    }

    @Override
    public void visit(Item item) {
        System.out.println(item.getName());
        itemsNo++;
    }

    public void displayResults() {
        System.out.println("Number of customers: " + customersNo);
        System.out.println("Number of orders:    " + ordersNo);
        System.out.println("Number of items:     " + itemsNo);
    }
}
