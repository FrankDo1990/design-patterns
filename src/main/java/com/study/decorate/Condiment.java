package com.study.decorate;

/**
 * Created by Frank on 2016/12/3.
 * 装饰者超类型
 */
public abstract class Condiment extends Beverage {

    @Override
    public abstract double cost();

    @Override
    public abstract String getDescription();
}
