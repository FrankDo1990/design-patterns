package com.study.command;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Frank on 2016/12/25.
 */
public class Switch {
    private boolean state;
    private LinkedList<Boolean> operStack = Lists.newLinkedList();

    public boolean isState() {
        return state;
    }

    public void switchOper(boolean state){
        this.state = state;
        operStack.push(state);
    }
    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getLastState(){
        return operStack.peekLast();
    }

    public void resetUndo(){
        if (operStack.size() > 0){
            operStack.removeLast();
        }
        state = operStack.isEmpty() ? false : operStack.getLast();
    }
}
