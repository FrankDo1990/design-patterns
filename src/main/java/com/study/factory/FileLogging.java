package com.study.factory;

/**
 * Created by Frank on 2016/12/4.
 */
public class FileLogging extends Logging{

    public FileLogging() {
    }

    public FileLogging(String name, String format) {
        this.name = name;
        this.format = format;
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
