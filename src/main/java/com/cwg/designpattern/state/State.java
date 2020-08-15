package com.cwg.designpattern.state;

/**
 * 创建时间：2019-10-27 11:08
 *
 * @author 曹文岗
 **/
public interface State {
    /**
     * 投入 25 分钱
     */
    void insertQuarter();

    /**
     * 退回 25 分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
