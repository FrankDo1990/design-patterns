package com.study.command;

/**
 * Created by Frank on 2016/12/25.
 */
public interface Command {
    void execute();

    void undo();

    void store();

    void load();
}
