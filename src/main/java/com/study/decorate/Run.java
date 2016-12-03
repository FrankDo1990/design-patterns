package com.study.decorate;

/**
 * Created by Frank on 2016/12/3.
 */
public class Run {
    public static void main(String args[]){
        Beverage coffee = new Coffee();
        Beverage beverage1 = new Salt(coffee);
        beverage1 = new MilkShake(beverage1);
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());

        Beverage cola = new Cola();
        Beverage beverage2 = new MilkShake(cola);
        beverage2 = new Salt(beverage2);
        beverage2 = new MilkShake(beverage2);

        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());

    }
}
