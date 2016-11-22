package com.study.oberser;

/**
 * Created by Frank on 16/11/18.
 */
public interface Observer {
    void update(Subject subject, Object args);

    void add2Sbuject(Subject subject);

    void removeObserver(Subject subject);
}
