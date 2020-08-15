package com.cwg.designpattern.facade;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 22:34
 * Provide a unified interface to a set of interfaces in a subsystem.Facade defines a higher-level interface that makes the subsystem easier to use.
 *
 * @author 曹文岗
 **/
public class FacadeTest {

    @Test
    public void facade(){
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
