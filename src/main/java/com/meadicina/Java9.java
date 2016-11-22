package com.meadicina;

/**
 * Created by root on 16-7-18.
 */
public class Java9 {
    public static void main(String[] args) {
        for (int f=0,g=10,h=0;f<10&&g>0||h>5;g--,f++,h++){
            f=g++;
            h=f-g;
            h++;
            g++;
            System.out.println(g);
        }
        //以下为test
        if(1 == 2 && 10/0 == 0){//&&短路与 第一个false 则不执行第二个判断
            System.out.println("11111111");
        }
        if(10==10||10/0==0){//短路或
            /*10==10这个条件返回true
              由于第一个条件满足 所以10/0==0这个条件就不必再判断了
            */
            System.out.print("条件满足！");
        }
    }

}
