package com.study.state;

/**
 * Created by Frank on 2016/12/29.
 */
public class SoldOutState implements State {

    MachineBall machineBall;

    public SoldOutState(MachineBall machineBall) {
        this.machineBall = machineBall;
    }

    @Override
    public void insertQuarter() {
        System.out.println("the machine has sold out");
    }

    @Override
    public void quitQuarter() {
        System.out.println("no quarter in machine");
    }

    @Override
    public void turnCrank() {
        System.out.println("nothing happened");
    }

    @Override
    public void dispense() {
        System.out.println("ball has sold out");
    }
}
