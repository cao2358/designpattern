package com.cwg.designpattern.singleton;

/**
 * 创建时间：2019-10-26 09:46
 * 线程不安全，不推荐使用
 *
 * @author 曹文岗
 **/
public class NotSafeSingleton {
    private static NotSafeSingleton notSafeSingleton = null;

    private NotSafeSingleton(){

    }

    public static NotSafeSingleton getInstance(){
        if(notSafeSingleton == null){ //这里存在线程不安全行为
            notSafeSingleton = new NotSafeSingleton();
        }

        return notSafeSingleton;
    }
}
