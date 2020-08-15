package com.cwg.designpattern.singleton;

/**
 * 创建时间：2019-10-26 09:40
 * Ensure a class has only one instance, and provide a global point of access to it.
 * 通用方式
 *
 * @author 曹文岗
 **/
public class Singleton {
    private static final Singleton singleton = new Singleton();

    /**
     * 限制产生多个对象
     */
    private Singleton(){

    }

    /**
     * 获取单例对象，如果类中还有其他方法，尽量是static方法
     * @return 单例对象
     */
    public static Singleton getInstance(){
        return singleton;
    }

}
