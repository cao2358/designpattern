package com.cwg.designpattern.composite;

/**
 * 创建时间：2019-10-26 22:10
 *
 * @author 曹文岗
 **/
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public void print(){
        print(0);
    }

    abstract void print(int level);

    public abstract void add(Component component);

    public abstract void remove(Component component);
}
