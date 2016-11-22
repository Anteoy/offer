package com.meadicina;

/**
 * Created by yan.chou on 16-7-18.
 * 不使用第三个变量实现两变量互换
 */
public class Java3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        a = b - a;
        b = b - a;//利用差值计算
        a = b + a;
//        System.err.printf("%d,%d",a,b);
        yh();
    }

    //通过异或运算能够使数据中的某些位翻转，其他位不变。这就意味着任意一个数与任意一个给定的值连续异或两次，值不变。
    public static void yh(){
        int a = 2;
        int b = 10;
        a = a^b;
        b = a^b;//a^b 去b得a
        a = a^b;//a^b 去a得b 这里的b已经是原来的a
        System.err.println(a+" "+b);
    }
}
