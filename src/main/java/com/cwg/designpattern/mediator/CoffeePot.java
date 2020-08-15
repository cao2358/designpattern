package com.cwg.designpattern.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 14:34
 *
 * @author 曹文岗
 **/
@Slf4j
public class CoffeePot extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot(){
        log.info("doCoffeePot()");
    }
}
