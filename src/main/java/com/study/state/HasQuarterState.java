package com.study.state;

import java.util.Random;

/**
 * Created by Frank on 2016/12/29.
 */
public class HasQuarterState implements State {

    MachineBall machineBall;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(MachineBall machineBall) {
        this.machineBall = machineBall;
    }

    @Override
    public void insertQuarter() {
        System.out.println("already has a quarter");
    }

    @Override
    public void quitQuarter() {
        System.out.println("ok! quit your quarter");
        machineBall.setState(machineBall.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turn crank");
        machineBall.setState(machineBall.getSoldState());
        boolean winner = random.nextInt(10) == 0;
        if (winner && machineBall.getCount() > 1){
            machineBall.setState(machineBall.getWinnerState());
        } else {
            machineBall.setState(machineBall.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("nothing happened");
    }
}
