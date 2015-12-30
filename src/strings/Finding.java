package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;
/**
 * Created by ShiKun on 2015/12/30.
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Eventing is full of the linnest's wings");
        while (m.find()) {

            printnb(m.group() + " ");

        }
        print();
        int i=0;
        while (m.find(i)) {

            printnb(m.group() + " ");
            i++;
        }
    }
}
