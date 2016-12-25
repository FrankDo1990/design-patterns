package com.study.oberser;

/**
 * Created by Frank on 16/11/18.
 */
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void setDataChanged(boolean changed);

    void notifyObserver();
}
