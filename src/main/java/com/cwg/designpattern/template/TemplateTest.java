package com.cwg.designpattern.template;

import org.junit.Test;

/**
 * 创建时间：2019-10-26 11:10
 *
 * @author 曹文岗
 **/
public class TemplateTest {

    @Test
    public void coffee(){
        MakingBeverage makingBeverage = new Coffee();
        makingBeverage.prepareRecipe();

        MakingBeverage makingBeverage1 = new Tee();
        makingBeverage1.prepareRecipe();
    }
}
