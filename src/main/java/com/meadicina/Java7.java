package com.meadicina;

/**
 * Created by root on 16-7-18.
 */
public class Java7 {
    public static void main(String[] args){
        int score = 65;
        char A = 65;
        char b = 97;
        System.out.println(b+""+A);
        switch(score){
            case 'A' :
                System.out.println("isok");
            case 'a' :
                System.out.println("isorok");
//                break;
            case 'B' :
                System.out.println("isandok");
//                break;
            case 'Z' :
                System.out.println("okandis");
                break;
            case 'c' :
                System.out.println("andis");
                break;
            default:
                System.out.println("可惜你错了");

        }

    }
}
