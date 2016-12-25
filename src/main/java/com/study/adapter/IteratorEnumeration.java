package com.study.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 旧的客户端代码调用Enumeration的适配器，老的客户端代码调用Enumeration的接口方法
 * Created by Frank on 2016/12/25.
 */
public class IteratorEnumeration implements Enumeration {
    private Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public IteratorEnumeration() {
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
