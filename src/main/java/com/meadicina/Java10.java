package com.meadicina;

import java.util.Random;

/**
 * Created by root on 16-7-18.
 */
public class Java10 {
    public static void main(String[] args) {
        for (int u=2;u>-7;u--){
            for(int u2=5;u<-5;u2--){
                if(u<2.5){
                    u2=-new Random().nextInt(2);
                }
                switch(u){
                    case 0:
                        System.out.println(1);
                    case 2:
                        System.out.println(2);
                        break;
                    default:
                        System.out.println(u2);
//                    case 22:
//                        System.out.println(2);
                }
                break;//没有此break以及后面的将会无限生成0或者-1
            }
            if(u<-5){
                break;
            }

        }
    }
}
