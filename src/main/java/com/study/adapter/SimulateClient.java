package com.study.adapter;

import com.google.common.collect.Lists;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Frank on 2016/12/25.
 */
public class SimulateClient {
    public static void main(String...args){
        newClient();
        oldClient();
    }

    public static void newClient(){
        //模拟老服务器代码
        Enumeration em = new Enumeration() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public Object nextElement() {
                return null;
            }
        };
        Iterator it = new EnumerationIterator(em);
        //模拟新客户端调用
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    public static void oldClient(){
        List<Integer> newClientList = Lists.newArrayList();
        //模拟老客户端代码
        Iterator it = newClientList.iterator();
        Enumeration em = new IteratorEnumeration(it);
        while (em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
    }
}
