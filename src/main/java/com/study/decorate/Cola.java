package com.study.decorate;

/**
 * Created by Frank on 2016/12/3.
 */
public class Cola extends Beverage {
    public Cola() {
        description = "cola";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.22;
    }
}
