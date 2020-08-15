package com.cwg.designpattern.prototype;

/**
 * 创建时间：2019-10-26 14:26
 *
 * @author 曹文岗
 **/
public class Prototype implements Cloneable {

    @Override
    public Prototype clone(){
        Prototype prototype = null;

        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}
