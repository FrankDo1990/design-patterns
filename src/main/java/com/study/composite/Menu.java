package com.study.composite;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.study.iterator.MenuItemIterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Frank on 2016/12/26.
 */
public class Menu extends MenuComponent {

    private String name;
    private String desc;
    List<MenuComponent> menuComponents = Lists.newArrayList();

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        Preconditions.checkPositionIndex(index, menuComponents.size(), "out of bounds");
        return menuComponents.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String desc() {
        return this.desc;
    }

    @Override
    public void print() {
        System.out.println(String.format("\n name = %s , desc = %s", name, desc));
        System.out.println("===============");
    }

    @Override
    Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
