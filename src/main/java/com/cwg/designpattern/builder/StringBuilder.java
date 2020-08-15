package com.cwg.designpattern.builder;

/**
 * 创建时间：2019-10-26 14:05
 *
 * @author 曹文岗
 **/
public class StringBuilder extends AbstractStringBuilder {


    public StringBuilder() {
        super(16);
    }

    public String toString(){
        return new String(value);
    }
}
