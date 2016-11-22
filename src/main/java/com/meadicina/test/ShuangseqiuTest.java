package com.meadicina.test;

import java.util.Random;

/**
 * Created by root on 16-7-18.
 */
public class ShuangseqiuTest {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i<6){
            int red = random.nextInt(33)+1;//1-33的随机数
            if(stringBuffer.indexOf(String.valueOf(red)) == -1){//如果StringBuffer中不存在则添加
                stringBuffer.append(red+" ");
                i++;
            }
        }
        int blue = random.nextInt(16)+1;
        stringBuffer.append(blue);
        System.out.println(stringBuffer.toString());
    }
}
