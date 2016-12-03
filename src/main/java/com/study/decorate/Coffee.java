package com.study.decorate;

/**
 * Created by Frank on 2016/12/3.
 */
public class Coffee extends Beverage {

    public Coffee() {
        description = "coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
