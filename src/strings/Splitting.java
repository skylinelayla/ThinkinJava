package strings;

import java.util.Arrays;

/**正则表达式spli()方法
 * Created by ShiKun on 2015/12/29.
 */
public class Splitting {
    public static String knights = "Then, when you have found the shrubbery," +
            "you must cut down the mightiest tree in the forest..." +
            "with a herring";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");

    }
}
