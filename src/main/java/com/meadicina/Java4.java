package com.meadicina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by root on 16-7-18.
 * 实现倒序排序
 */
public class Java4 {
    public static void main(String[] args) {
        List<Long> S = new ArrayList<Long>();
        S.add(1l);
        S.add(19l);
        S.add(-19l);
        S.add(0l);
        Long[] t = (Long[]) S.toArray(new Long[S.size()]);
        Arrays.sort(t);//对数组进行排序
        Collections.sort(S);//正序
        Collections.reverse(S);//倒序输出
        for (Long o:S
             ) {
            System.out.println(o);
        }
    }
}
