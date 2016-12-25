package com.study.decorate;

/**
 * Created by Frank on 2016/12/3.
 */
public class MilkShake extends Condiment {
    Beverage beverage;

    public MilkShake(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "milkShake, " + beverage.getDescription();
    }
}
