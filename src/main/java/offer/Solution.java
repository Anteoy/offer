package offer;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by root on 16-7-16.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {


    public static void main(String[] arg){
        int[][] arr ={{1,11},{2,22},{3,33}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1][1]);
        System.out.printf(new Solution().solution(arr,33)?"存在":"不存在");

        ArrayList a = new ArrayList();
        a.add(1);
        a.addAll(new ArrayList(asList("Buenos Aires", "Córdoba", "La Plata")));
        new StringBuffer("ss").length();
        new String("as").length();
        new Solution().printListFromTailToHead(a);

    }

    public boolean solution(int[][] arr,int a) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row <= arr.length - 1 && col >= 0) {

            if (arr[row][col] < a) {
                row++;
            } else if (arr[row][col] > a) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }



    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ArrayList listNode) {
        int i = 0;
        if(listNode!=null){
            this.printListFromTailToHead(listNode);
//            arrayList.add(listNode.val);
            System.out.println(1111);
        }
            return arrayList;
    }
}
