package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ShiKun on 2015/12/30.
 */
public class Test {
    public static void main(String[] args) {
        String test = "Java now has regular expression";
        Pattern p = Pattern.compile("s{0,3}");

        Matcher m = p.matcher(test);
        if (m.find() == true) {
            System.out.println("OK");

        }else {
            System.out.println("NO");

        }
    }
}
