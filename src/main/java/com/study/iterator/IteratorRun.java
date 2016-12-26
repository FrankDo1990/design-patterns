package com.study.iterator;

import java.util.Iterator;

/**
 * Created by Frank on 2016/12/26.
 */
public class IteratorRun {

    public static void main(String...args){
        PancakeHouse pancakeHouse = new PancakeHouse();
        pancakeHouse.addItem("pancake", 2.10D, "basic pancake", true);
        pancakeHouse.addItem("meat", 13.2D, "add some meat", false);
        pancakeHouse.addItem("beaf", 14.2D, "add some beaf", false);

        Iterator<MenuItem> pancakeIt = pancakeHouse.createIterator();
        while (pancakeIt.hasNext()){
            MenuItem item = pancakeIt.next();
            if (item != null){
                item.print();
            }
        }

        BeerHouse beerHouse = new BeerHouse();
        beerHouse.addItem("qingdao", 6d, "qingdao beer", false);
        beerHouse.addItem("yanjing", 3d, "yanjing beer", false);
        beerHouse.addItem("german", 20d, "geman beer", false);
        beerHouse.addItem("ameraca", 10d, "america beer", false);

        Iterator<MenuItem> beerIt = beerHouse.createIterator();
        while (beerIt.hasNext()){
            MenuItem item = beerIt.next();
            if (item != null){
                item.print();
            }
        }
    }
}
