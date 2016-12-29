package com.study.state;

/**
 * Created by Frank on 2016/12/30.
 */
public class WinnerState implements State {
    MachineBall machineBall;

    public WinnerState(MachineBall machineBall) {
        this.machineBall = machineBall;
    }

    @Override
    public void insertQuarter() {
        System.out.println("invalid action");
    }

    @Override
    public void quitQuarter() {
        System.out.println("invalid action");
    }

    @Override
    public void turnCrank() {
        System.out.println("invalid action");
    }

    @Override
    public void dispense() {
        System.out.println("you has been a winner!!!");
        machineBall.giveOutABall();
        if (machineBall.getCount() > 0){
            machineBall.giveOutABall();
            machineBall.setState(machineBall.getCount() > 0 ? machineBall.getNoQuarterState() : machineBall.getSoldOutState());
        }else {
            machineBall.setState(machineBall.getNoQuarterState());
        }
    }
}
