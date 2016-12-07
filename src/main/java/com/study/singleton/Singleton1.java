package com.study.singleton;

/**
 * Created by Frank on 2016/12/7.
 * DCL检查模式
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        if (instance == null){
            synchronized (Singleton1.class){
                if (instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

}
