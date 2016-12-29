package com.study.state;

/**
 * Created by Frank on 2016/12/30.
 */
public class Run {
    public static void main(String...args){
        MachineBall machineBall = new MachineBall(10);

        machineBall.insertQuarter();
        machineBall.quitQuarter();
        machineBall.insertQuarter();
        machineBall.turnCrank();
        machineBall.dispense();
    }
}
