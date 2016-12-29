package com.study.state;

/**
 * Created by Frank on 2016/12/29.
 */
public interface State {

    void insertQuarter();

    void quitQuarter();

    void turnCrank();

    void dispense();
}
