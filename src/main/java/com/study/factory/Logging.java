package com.study.factory;

/**
 * Created by Frank on 2016/12/4.
 * 日志超类型
 */
public abstract class Logging {
    String name = "Logging";
    String format = "Logging format";

    public abstract void error();
    public abstract void info();
    public abstract void warnning();
}
