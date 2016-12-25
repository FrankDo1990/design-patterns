package com.study.strategy; /**
 * Created by Frank on 16/11/7.
 */

/**
 * @Duck 类的具体实现子类,构造FlyBehavior的具体实现,将FlyBehavior和QuackBehavior委托给具体的接口实现
 */
public class MallardDuck extends Duck {
    //实现mallardDuck的委托对象注入,不足之处是将MallardDuck的实现写死了
    public MallardDuck() {
        super();
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public static void main(String[] args){
        Duck duck = new MallardDuck();
        duck.performFlyBehavior();
        duck.performQuack();
    }
}
