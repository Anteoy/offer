package com.meadicina.test;

import java.util.Random;

/**
 * Created by root on 16-7-18.
 */
public class MyRandom {
    public static void main(String[] args) {
        int n = 33;
        Random rand = new Random();//新建一个随机类
        boolean[]  bool = new boolean[n];
        int randInt = 0;
        for(int i = 0; i < 6 ; i++) {
            do {
                randInt  = rand.nextInt(n);//产生一个随机数
                System.out.println(bool[randInt]);
            }while(bool[randInt]);
            bool[randInt] = true;
            System.out.println(randInt);
        }
    }
}
