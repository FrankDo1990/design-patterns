package com.study.oberser;

/**
 * Created by Frank on 16/11/18.
 */
public class NodeObserver implements Observer, DisplayBehavior {

    private Subject subject;


    @Override
    public void dataHandler(Object data) {
        System.out.println(this.hashCode() +" get data = " + data);
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

    @Override
    public void add2Sbuject(Subject subject) {
        if (subject != null) {
            subject.addObserver(this);
        }
    }

    @Override
    public void removeObserver(Subject subject) {
        if (subject != null ){
            subject.removeObserver(this);
        }
    }
}
