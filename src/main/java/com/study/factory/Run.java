package com.study.factory;

/**
 * Created by Frank on 2016/12/4.
 */
public class Run {
    public static void main(String args[]){
        AbstracLoggingFactory factory = new LinuxLoggingFactory();
        Logging fileLogging = factory.createLogging("file");
        fileLogging.info();
        Logging terminalLogging = factory.createLogging("terminal");
        terminalLogging.info();

    }
}
