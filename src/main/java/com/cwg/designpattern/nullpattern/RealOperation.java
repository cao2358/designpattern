package com.cwg.designpattern.nullpattern;

/**
 * 创建时间：2019-10-27 11:38
 *
 * @author 曹文岗
 **/
public class RealOperation extends AbstractOperation {
    @Override
    void request() {
        System.out.println("do something");
    }
}
