package com.study.strategy;

/**
 * Created by Frank on 16/11/6.
 * 有翅膀的飞行动作, @FlyBehavior的具体子类实现
 *
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void flyBehavior() {
        System.out.println("I'm flying!");
    }
}
