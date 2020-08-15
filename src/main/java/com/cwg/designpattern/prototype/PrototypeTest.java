package com.cwg.designpattern.prototype;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 创建时间：2019-10-26 14:28
 * Specify the kinds of objects to create using a prototypical instance,and create new objects by copying this prototype.
 *
 * @author 曹文岗
 **/
public class PrototypeTest {
    @Test
    public void prototype(){
        Prototype prototype = new Prototype();
        Prototype clone = prototype.clone();

        assertThat(prototype).isNotEqualTo(clone);
    }

}
