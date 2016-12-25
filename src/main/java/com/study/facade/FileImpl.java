package com.study.facade;

/**
 * Created by Frank on 2016/12/25.
 */
public class FileImpl implements FileInterface {

    public static FileImpl createFileImpl(){
        return new FileImpl();
    }

    @Override
    public void openFile() {

    }

    @Override
    public void write() {

    }

    @Override
    public void close() {

    }
}
