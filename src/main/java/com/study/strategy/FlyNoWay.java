package com.study.strategy;

/**
 * Created by Frank on 16/11/6.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void flyBehavior() {
        System.out.println("I can't fly, So noting's gonna happen!");
    }
}
