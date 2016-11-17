package com.study.oberserpattern;

import java.util.Objects;

/**
 * Created by Frank on 16/11/18.
 */
public class NodeObserver implements Observer, DisplayBehavior {

    private Subject subject;

    @Override
    public void dataHandler(Object data) {
        System.out.println("get data = " + data);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(Subject subject, Object args) {
        if (args instanceof String){
            dataHandler(args);

        }
    }


}
