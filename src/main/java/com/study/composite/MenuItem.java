package com.study.composite;

import java.util.Iterator;

/**
 * Created by Frank on 2016/12/26.
 */
public class MenuItem extends MenuComponent {

    private String name;
    private double price;
    private String desc;
    private boolean v;

    public MenuItem(String name, double price, String desc, boolean v) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.v = v;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public boolean isV() {
        return v;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", v=" + v +
                '}';
    }
}
