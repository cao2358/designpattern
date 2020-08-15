package com.cwg.designpattern.chain;

/**
 * 创建时间：2019-10-26 21:16
 *
 * @author 曹文岗
 **/
public abstract class Handler {

    protected Handler successor; //nextHandler

    public Handler(Handler successor){
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
