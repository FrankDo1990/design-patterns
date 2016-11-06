package com.study.strategy;

/**
 * Created by Frank on 16/11/7.
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void flyBehavior() {
        System.out.println("I can use the rock to fly !");
    }

}
