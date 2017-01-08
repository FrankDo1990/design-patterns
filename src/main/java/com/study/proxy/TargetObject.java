package com.study.proxy;

/**
 * Created by Frank on 2017/1/8.
 */
public class TargetObject implements Operation {

    @Override
    public void sign() {
        System.out.println("real sign this");
    }
}
