package com.cwg.designpattern.adapter;

/**
 * 创建时间：2019-10-26 21:53
 *
 * @author 曹文岗
 **/
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
