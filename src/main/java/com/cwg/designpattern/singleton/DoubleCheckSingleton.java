package com.cwg.designpattern.singleton;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 09:50
 * 双重检测，提升性能，保证安全，但是也可能存在问题，建议使用通用方式
 *
 * @author 曹文岗
 **/
@Slf4j
@Data
class DoubleCheckSingleton {

    private static DoubleCheckSingleton doubleCheckSingleton = null;

    private String a;

    private String b;

    private TData tData;

    private DoubleCheckSingleton() throws InterruptedException {
        a = "1";
        b = "2";
        Thread thread = new Thread(() -> {
            try {
                tData = new TData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
//        thread.join(); //这句很关键，如果不join则有可能构造出一个未完全构造出来的对象使用，程序报错

    }

    /**
     * 此方法基本有效，但是仍然不推荐，理由：有可能这个构造函数初始化到一半被另一个线程拿去使用，造成未完全初始化的对象呗拿去使用了
     * @return false
     */
    static DoubleCheckSingleton getInstance() throws InterruptedException {
        if(doubleCheckSingleton == null){ //为了减少锁竞争
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){ //为了保证只初始化一次
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }

        return doubleCheckSingleton;
    }

    /**
     * 模拟对象
     */
    @lombok.Data
    public static class TData{
        private String a;
        private String b;

        TData() throws InterruptedException {
            a = "a";

            Thread.sleep(1000);

            b = "b";
        }

    }
}
