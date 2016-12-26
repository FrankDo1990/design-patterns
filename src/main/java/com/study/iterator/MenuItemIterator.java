package com.study.iterator;

import java.util.Iterator;

/**
 * Created by Frank on 2016/12/26.
 */
public class MenuItemIterator implements Iterator {

    private MenuItem[] items;
    private int pos;

    public MenuItemIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items != null && pos < items.length && items[pos] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = pos <= items.length ? items[pos] : null;
        pos++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("can't remove");
    }
}
