package com.study.factory;

/**
 * Created by Frank on 2016/12/4.
 */
public class LinuxLoggingFactory extends AbstracLoggingFactory {
    @Override
    public Logging createLogging(String type) {
        if (type.equals("file")){
            return  new FileLogging();
        }else if (type.equals("terminal")){
            return new TerminalLogging();
        }else {
            return null;
        }
    }
}
