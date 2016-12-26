package com.study.composite;

import java.util.Iterator;

/**
 * Created by Frank on 2016/12/26.
 */
public class NullIterator implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
