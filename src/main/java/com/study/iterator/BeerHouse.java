package com.study.iterator;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Frank on 2016/12/26.
 */
public class BeerHouse implements Menu{

    private List<MenuItem> menuItems = Lists.newArrayList();

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    public void addItem(String name, double price, String desc, boolean isV){
        menuItems.add(new MenuItem(name, price, desc, isV));
    }
}
