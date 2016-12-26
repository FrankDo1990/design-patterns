package com.study.templateMethod;

/**
 * Created by Frank on 2016/12/26.
 */
public abstract class BeveragePrepare {

    public final void prepareBeverage(){
        boilWater();
        brew();
        pourWater();
        if (hook()){
            addCondiment();
        }
    }

    public void boilWater(){
        System.out.println("boling the water");
    }

    abstract void brew();

    public void pourWater() {
        System.out.println("pouring the water");
    }

    abstract void addCondiment();

    //钩子，子类实现
    public boolean hook(){
        return false;
    }
}
