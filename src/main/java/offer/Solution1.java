package offer;

/**
 * Created by root on 16-7-17.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution1 {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s","%20");
    }

    public static void main(String[] args){
        replaceSpace(new StringBuffer("we are happy"));
        System.out.println(replaceSpace(new StringBuffer("we are happy")));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Constructor bb");
        System.out.printf("%s",replaceSpace(stringBuffer));
    }
}
