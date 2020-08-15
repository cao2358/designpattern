package com.cwg.designpattern.visitor;

/**
 * 创建时间：2019-10-27 11:00
 *
 * @author 曹文岗
 **/
public class Item implements Element {

    private String name;

    Item(String name){
        this.name = name;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String getName(){
        return name;
    }
}
