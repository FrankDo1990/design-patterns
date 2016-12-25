package com.study.strategy;

/**
 * Created by Frank on 16/11/7.
 * 动态添加鸭子行为
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        super();
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public static void main(String[] args){
        Duck duck = new ModelDuck();
        duck.performFlyBehavior();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithRocket());
        duck.setQuackBehavior(new Quack());
        duck.performFlyBehavior();
        duck.performQuack();
    }
}
