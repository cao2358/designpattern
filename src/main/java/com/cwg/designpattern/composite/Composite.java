package com.cwg.designpattern.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建时间：2019-10-26 22:12
 *
 * @author 曹文岗
 **/
@Slf4j
public class Composite extends Component {

    private List<Component> child;

    public Composite(String name){
        super(name);
        child = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for(int i = 0; i < level; i++){
            System.out.print("--");
        }

        System.out.println("Composite:" + name);

        for (Component component : child) {
            component.print(level + 1);
        }
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void remove(Component component) {
        child.remove(component);
    }
}
