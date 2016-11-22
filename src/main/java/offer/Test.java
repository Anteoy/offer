package offer;

/**
 * Created by root on 16-7-17.
 */
public class Test {

    public Test() {
// TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
// TODO Auto-generated method stub


        System.out.println("He"); //println換行 效果等於System.out.printf("He"+"\n");
        System.out.printf("He"+"\t");//这里不能使用\s空格
        System.out.print("Hello!");//print不會換行
        System.out.printf("%d",44);//printf當作c程式 %d是印出數字
        System.out.printf("%s","嘿嘿"); //%s是印出字串
        System.out.printf("%c",'A');//%c印出字元

    }

}
