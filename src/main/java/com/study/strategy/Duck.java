package com.study.strategy; /**
 * Created by Frank on 16/11/6.
 */

/**
 * strategy design patterns,将可变对象独立出来
 */
public abstract class Duck {
    //面向接口设计,将可变对象(FlyBehavior, Quack)独立出去
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //根据子类中FlyBeHavior的具体实现进行调用
    public void performFlyBehavior(){
        flyBehavior.flyBehavior();
    }
    //根据子类的quack的具体实现调用
    public void performQuack(){
        quackBehavior.quackBehavior();
    }
    public void swim(){
        System.out.println("I'm swimming !");
    };

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
