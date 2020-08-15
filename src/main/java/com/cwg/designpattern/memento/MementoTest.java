package com.cwg.designpattern.memento;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 创建时间：2019-10-27 10:40
 *
 * @author 曹文岗
 **/
@Slf4j
public class MementoTest {

    @Test
    public void memento(){
        Calculator calculator = new CalculatorImp();
        calculator.setFirstNumber(9);
        calculator.setSecondNumber(8);

        log.info("result is {}", calculator.getCalculationResult());

        PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();

        calculator.setFirstNumber(16);
        calculator.setSecondNumber(-220);
        log.info("result is {}", calculator.getCalculationResult());

        calculator.restorePreviousCalculation(memento);
        log.info("result is {}", calculator.getCalculationResult());
    }
}
