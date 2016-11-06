package com.study.strategy;

/**
 * Created by Frank on 16/11/6.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quackBehavior() {
        System.out.println("quack ! quack !");
    }
}
