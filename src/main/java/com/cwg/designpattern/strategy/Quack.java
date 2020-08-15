package com.cwg.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 21:46
 *
 * @author 曹文岗
 **/
@Slf4j
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        log.info("quack!");
    }
}
