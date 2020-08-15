package com.cwg.designpattern.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 21:20
 *
 * @author 曹文岗
 **/
@Slf4j
public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler handler){
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType().equals(RequestType.TYPE1)){
            log.info("{} is handler by ConcreteHandler1", request.getName());
            return;
        }

        if(successor != null){
            successor.handleRequest(request);
        }
    }
}
