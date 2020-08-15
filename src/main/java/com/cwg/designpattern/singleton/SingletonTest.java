package com.cwg.designpattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 创建时间：2019-10-26 10:00
 *
 * @author 曹文岗
 **/
@Slf4j
public class SingletonTest {

    /**
     * 测试使用到未完整构造的对象，这种情况当你的单例对象构造没有完成时，这里会出现意外报错哦
     */
    @Test
    public void testNotComplete() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
                log.info("doubleCheckSingleton is: {}, a is: {},{}, b is: {},{}",doubleCheckSingleton, doubleCheckSingleton.getA(), doubleCheckSingleton.getTData().getA(), doubleCheckSingleton.getB(),  doubleCheckSingleton.getTData().getB());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread test1 = new Thread(runnable);
        Thread test2 = new Thread(runnable);
        Thread test3 = new Thread(runnable);

        test1.start();
        test2.start();
        test3.start();

        test1.join();
        test2.join();
        test3.join();
    }
}
