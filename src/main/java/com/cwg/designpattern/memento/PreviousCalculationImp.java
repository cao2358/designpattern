package com.cwg.designpattern.memento;

/**
 * 创建时间：2019-10-27 10:46
 *
 * @author 曹文岗
 **/
public class PreviousCalculationImp implements PreviousCalculationToCareTaker, PreviousCalculationToOriginator{

    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
