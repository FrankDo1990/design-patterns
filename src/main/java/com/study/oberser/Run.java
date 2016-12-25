package com.study.oberser;

/**
 * Created by Frank on 16/11/18.
 */
public class Run {
    public static void main(String args[]){
        Subject subject = new DataSubject();
        Observer nodeObserver1 = new NodeObserver();
        nodeObserver1.add2Sbuject(subject);
        Observer nodeObserver2 = new NodeObserver();
        nodeObserver2.add2Sbuject(subject);
        ((DataSubject)subject).setData("first notice !");
        ((DataSubject)subject).setData("second  notice !");
    }
}
