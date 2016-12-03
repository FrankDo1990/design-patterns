package com.study.decorate;

/**
 * Created by Frank on 2016/12/3.
 * 关键在于被装饰者和装饰者必须有相同的超类型——这使得装饰者可以完全替代装饰者
 */
public abstract class Beverage {
    String description  = "unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
