package com.meadicina;

/**
 * Created by root on 16-7-18.
 */
public class Java6 {
    int a;
    public static void main(String[] args) {
        int age = 50;
        if (age>20){
            System.out.println("青年人");
        }else if(age>40){
            System.out.println("中年人");
        }else if (age > 60){
            System.out.println("老年人");
        }
    }
    public void aa(){
        int b;
        System.out.println(a);
        //System.out.println(b);必须初始化
    }
}
