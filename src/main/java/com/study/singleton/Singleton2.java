package com.study.singleton;

/**
 * Created by dufeng on 2017/5/13.
 */
public class Singleton2 {
    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        return LazyHolder.instance;
    }
    private static class LazyHolder {
        private static final Singleton2 instance;
        static {
           instance = new Singleton2();
       }
    }
}
