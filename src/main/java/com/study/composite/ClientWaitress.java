package com.study.composite;

import java.util.Iterator;

/**
 * Created by Frank on 2016/12/26.
 */
public class ClientWaitress {
    private MenuComponent allMenu;

    public ClientWaitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }
    //print all menus
    public void print(){
        Iterator iterator = allMenu.createIterator();
        if (iterator != null){
            while (iterator.hasNext()){
                MenuComponent menuComponent = (MenuComponent) iterator.next();
                if (menuComponent != null){
                    try {
                        menuComponent.print();
                    }catch (UnsupportedOperationException e){

                    }
                }
            }
        }
    }
}
