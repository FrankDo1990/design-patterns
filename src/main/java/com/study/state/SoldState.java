package com.study.state;

/**
 * Created by Frank on 2016/12/29.
 */
public class SoldState implements State {
    MachineBall machineBall;

    public SoldState(MachineBall machineBall) {
        this.machineBall = machineBall;
    }

    @Override
    public void insertQuarter() {
        System.out.println("there is a quarter in machine");
    }

    @Override
    public void quitQuarter() {
        System.out.println("can't quit quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you have already turnCrank");
    }

    @Override
    public void dispense() {
        machineBall.giveOutABall();
        machineBall.setState(machineBall.getCount() > 0 ? machineBall.getNoQuarterState() : machineBall.getSoldOutState());
    }
}
