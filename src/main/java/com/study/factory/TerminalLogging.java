package com.study.factory;

/**
 * Created by Frank on 2016/12/4.
 */
public class TerminalLogging extends Logging {
    public TerminalLogging() {
        this.name = "terminal";
        this.format = "terminal format";
    }

    @Override
    public void error() {

    }

    @Override
    public void info() {

    }

    @Override
    public void warnning() {

    }
}
