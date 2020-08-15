package com.cwg.designpattern.memento;

/**
 * 创建时间：2019-10-27 10:41
 *
 * Originator Interface
 * @author 曹文岗
 **/
public interface Calculator {
    PreviousCalculationToCareTaker backupLastCalculation();

    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
