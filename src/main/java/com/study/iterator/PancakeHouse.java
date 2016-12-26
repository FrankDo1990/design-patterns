package com.study.iterator;


import java.util.Iterator;

/**
 * Created by Frank on 2016/12/26.
 */
public class PancakeHouse implements Menu{

    private final int MAX_LEN = 10;
    private MenuItem[] menuItems = new MenuItem[MAX_LEN];
    private int capacity = 0;

    public void addItem(String name, double price, String desc, boolean isV){
        if (capacity == MAX_LEN){
            throw new UnsupportedOperationException("menu full");
        } else {
            menuItems[capacity] = new MenuItem(name, price, desc, isV);
            capacity++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new MenuItemIterator(menuItems);
    }
}
