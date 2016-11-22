package com.meadicina;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by root on 16-7-18.
 * 实现双色球选号
 */
public class Java2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for(int j = 0;j<34;j++){
            if(j>0)
                list.add(j);
        }
        int[] t = new int[7];
        boolean[] b = new boolean[34];
        int red;
        for(int k=0;k<7;k++){
            if(k == 6) {
                System.out.println("蓝色球的号码是"+random.nextInt(15)+1);//返回1到15的随机整数
                return;
            }
            do{
                red =list.get(random.nextInt(31)+1);

            }while(b[red]);
            b[red] = true;
            System.out.println("红球的第"+(k+1)+"个号码是"+ list.get(random.nextInt(34)));

//            if (k<6)
//                System.out.println("红球的第"+(k+1)+"个号码是"+ list.get(random.nextInt(34)));

        }

    }
}
