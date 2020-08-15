package com.cwg.designpattern.strategy;

/**
 * 创建时间：2019-10-26 21:47
 *
 * @author 曹文岗
 **/
public class Duck {
    private QuackBehavior quackBehavior;

    public void performQuack(){
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
