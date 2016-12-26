package com.study.iterator;

import com.google.common.base.Objects;

/**
 * Created by Frank on 2016/12/26.
 */
public class MenuItem {

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

    public String getName() {
        return name;
    }

    public MenuItem setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public MenuItem setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public MenuItem setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public boolean isV() {
        return v;
    }

    public MenuItem setV(boolean v) {
        this.v = v;
        return this;
    }

    public void print(){
        System.out.println(toString());
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
