package com.meadicina;

/**
 * Created by root on 16-7-18.
 * 答案-1
 */
public class Java1 {

    public Java1(){

    }



    //如下程序会输出什么
    public void Java1(String test,Integer a){//有返回值的并不是构造函数，构造函数只能向上面的一样
        int i = -9;
        for(i=-9;i<-1;i++){
            if(i>-4){
                i--;
                i++;
                i++;
            }
        }
        System.out.println(i);
        System.out.printf("%d",i);
    }

     static  Java1 java1 = new Java1();



    public static void main(String[] args) {
        java1.Java1("a",1);
    }
}
