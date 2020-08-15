package com.cwg.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建时间：2019-10-27 11:05
 *
 * @author 曹文岗
 **/
public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
