package com.study.state;

/**
 * Created by Frank on 2016/12/29.
 * 将对应状态的行为委托到状态类执行，对于客户端而言，似乎是在运行期间改变了内部代码
 */
public class MachineBall implements State{


    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;
    private State state;
    int count = 0;

    public MachineBall(int count) {
        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        state = count > 0 ? noQuarterState : soldOutState;
    }

    @Override
    public void insertQuarter() {
        state.insertQuarter();
    }

    @Override
    public void quitQuarter() {
        state.quitQuarter();
    }

    @Override
    public void turnCrank() {
        state.turnCrank();
    }

    @Override
    public void dispense() {
        state.dispense();
    }

    public void giveOutABall(){
        System.out.println("there's a ball in the slot");
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public MachineBall setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
        return this;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public MachineBall setWinnerState(State winnerState) {
        this.winnerState = winnerState;
        return this;
    }
}
