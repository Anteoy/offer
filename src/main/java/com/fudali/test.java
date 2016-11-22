package com.fudali;

import java.util.*;

/**
 * Created by root on 16-7-19.
 */
public class test {
    public static void main(String[] args) {
        int i = 1/2;
        System.out.println(i);
        Set a = new HashSet();
        a.add("dsf");
        a.add("dsfa");
        a.add("dsff");
        a.add("a");
        for (int h = 0;h<a.size();h++){
//            System.out.println();
        }
        Iterator iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static List<Integer> makeList1(List<Integer> oo , int n) {

        oo.clear();
        Long begin = System.currentTimeMillis();
        for(int i = 0 ; i < n ; i++) {
            oo.add(i);          //1
            oo.add(0 , i);          //2
            oo.add(i/2 , i);        //3
        }
        System.out.println(oo.getClass().getName() + ":我是添加方法:" + (System.currentTimeMillis() - begin));
        return oo;
    }
}
