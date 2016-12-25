package com.study.oberser;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Frank on 16/11/18.
 */
public class DataSubject implements Subject{
    List<Observer> observers = Lists.newArrayList();
    boolean changed = false;
    public String data;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index != -1 ){
            observers.remove(observer);
        }
    }

    @Override
    public void setDataChanged(boolean changed) {
        this.changed = changed;
    }

    @Override
    public void notifyObserver() {
       if (changed){
           for (Observer o : observers){
               o.update(this, data);
           }
           setDataChanged(false);
       }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        setDataChanged(true);
        notifyObserver();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
