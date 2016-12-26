package com.study.iterator;

import java.util.Iterator;

/**
 * Created by Frank on 2016/12/26.
 */
public interface Menu<T> {

    Iterator<T> createIterator();


}
