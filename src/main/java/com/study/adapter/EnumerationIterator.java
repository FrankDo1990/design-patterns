package com.study.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 新的客户端代码调用老的服务器代码，新的代码调用Iterator接口的方法
 * Created by Frank on 2016/12/25.
 */
public class EnumerationIterator implements Iterator {

    private Enumeration enumeration;

    public EnumerationIterator() {
    }

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("adaptor unsupport oper type");
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
