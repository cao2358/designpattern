package com.cwg.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建时间：2019-10-27 10:57
 *
 * @author 曹文岗
 **/
public class Order implements Element {

    private String name;
    private List<Item> items = new ArrayList();

    Order(String name){
        this.name = name;
    }

    Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Item item : items) {
            item.accept(visitor);
        }
    }

    String getName() {
        return name;
    }

    void addItem(Item item) {
        items.add(item);
    }
}
