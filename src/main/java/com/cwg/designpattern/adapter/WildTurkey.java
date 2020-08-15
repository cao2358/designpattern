package com.cwg.designpattern.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 21:52
 *
 * @author 曹文岗
 **/
@Slf4j
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
       log.info("gobble!");
    }
}
