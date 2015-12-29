package strings;

/**String对象是不能改变的
 * Created by ShiKun on 2015/12/28.
 */
public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        String qq = upcase(q);
        System.out.print(q);
        System.out.print(qq);


    }
}
