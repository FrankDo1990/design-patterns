package com.study.composite;

/**
 * Created by Frank on 2016/12/26.
 */
public class Run {

    public static void main(String...args){
        MenuComponent pancake = new Menu("pancake", "pancake menus");
        MenuComponent beer = new Menu("beer", "beer menus");
        MenuComponent stick = new Menu("stick", "pancake menus");

        MenuComponent allMenu = new Menu("all Menu", "all Menu");
        allMenu.add(pancake);
        allMenu.add(beer);
        allMenu.add(stick);

        pancake.add(new MenuItem("pancake base", 1.0D, "basic pancake", true));
        pancake.add(new MenuItem("pancake bacon", 2.0D, "bacon pancake", false));
        pancake.add(new MenuItem("beaf bacon", 10.0D, "beaf pancake", false));
        pancake.add(new MenuItem("unknow bacon", 10.0D, "unknow pancake", false));
        MenuComponent pancakeSub = new Menu("pancake sub", "pancake sub menu");
        pancakeSub.add(new MenuItem("chicken pancake", 10.0D, "chicken pancake", false));
        pancake.add(pancakeSub);

        stick.add(new MenuItem("base stick", 2.0D, "basic stick", false));

        ClientWaitress clientWaitress = new ClientWaitress(allMenu);
        clientWaitress.print();
    }
}
