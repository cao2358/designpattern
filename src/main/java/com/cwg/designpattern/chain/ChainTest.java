package com.cwg.designpattern.chain;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 21:23
 * Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.Chain the receiving objects and pass the request along the chain until an object handles it
 *
 * @author 曹文岗
 **/
public class ChainTest {

    @Test
    public void chain(){
        Handler handler = new ConcreteHandler1(null);
        Handler handler1 = new ConcreteHandler2(handler);

        Request request = new Request(RequestType.TYPE1, "request1");
        handler1.handleRequest(request);

        Request request1 = new Request(RequestType.TYPE2, "request2");
        handler1.handleRequest(request1);
    }
}
