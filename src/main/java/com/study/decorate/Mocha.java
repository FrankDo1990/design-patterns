package com.study.decorate;

/**
 * Created by Frank on 2016/12/3.
 */
public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha() {
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "moca," + beverage.getDescription();
    }
}
