/**
 * Created by ShiKun on 2015/12/13.
 */
public class ChangeClass {
    ChangeClass(String... args) {
        for (String ss : args) {
            System.out.println(ss + " ");
        }
    }

    public static void main(String[] args) {
        String[] ss = new String[]{"aa", "bb", "cc"};
        ChangeClass cd = new ChangeClass(ss);
    }
}
