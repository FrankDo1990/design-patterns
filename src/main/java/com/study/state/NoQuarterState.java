package com.study.state;

/**
 * Created by Frank on 2016/12/29.
 */
public class NoQuarterState implements State {

    MachineBall machineBall;

    public NoQuarterState(MachineBall machineBall) {
        this.machineBall = machineBall;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert a quarter");
        machineBall.setState(machineBall.getHasQuarterState());
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
        System.out.println("can't dispense");
    }
}
