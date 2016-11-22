package com.fudali;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by root on 16-7-20.
 */
public  class e extends d{
     void bb() {
        this.aa();
    }

    public void a() {

    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }

        //遍历map中的键

        for (Integer key : map.keySet()) {

            System.out.println("Key = " + key);

        }

        //遍历map中的值

        for (Integer value : map.values()) {

            System.out.println("Value = " + value);

        }

        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();

        while (entries.hasNext()) {

            Map.Entry<Integer, Integer> entry = entries.next();

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }


        //Iterator不使用泛型
        Iterator entries1 = map.entrySet().iterator();

        while (entries1.hasNext()) {

            Map.Entry entry = (Map.Entry) entries.next();

            Integer key = (Integer)entry.getKey();

            Integer value = (Integer)entry.getValue();

            System.out.println("Key = " + key + ", Value = " + value);

        }


        //通过键找值遍历（效率低）
        for (Integer key : map.keySet()) {

            Integer value = map.get(key);

            System.out.println("Key = " + key + ", Value = " + value);

        }
    }
}
