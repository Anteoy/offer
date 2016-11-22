package com.meadicina;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;

/**
 * Created by root on 16-7-18.
 */
public class Java5  {
    public static void main(String[] args) {
        String s = "AW_09*19\\12_77";
        String[] a = s.split("_");
        Arrays.sort(a);//升序
        Arrays.asList(a);
        Collections.reverse(asList(a));//降序
        char[] c = s.toCharArray();
        Arrays.sort(c);
     //   Arrays.sort(c,Collections.reverseOrder()); 此种用法不能对基本类型数组记性倒序
        for (char o:c
             ) {
            System.out.println(o);
        }

       /* String.valueOf(a);
        System.out.println(Arrays.toString(a));
        System.out.println(new String(c));//可以用此转换
        System.out.println(String.valueOf(a));//转换出来为地址 不能用次转换
        System.out.println(s.substring(0,1));*/
    }


}
