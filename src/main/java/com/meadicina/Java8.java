package com.meadicina;

/**
 * Created by root on 16-7-18.
 */
public class Java8 {
    public static void main(String[] args) {
        int k = 10;
        while(k<100){
            System.out.println("未越界");
            k = k + 2;
            if(k>15){
                k=100;
            }
        }
    }
}
