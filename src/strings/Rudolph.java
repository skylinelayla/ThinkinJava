package strings;

/**匹配Rudolph
 * Created by ShiKun on 2015/12/30.
 */
public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[]{"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"}) {
            System.out.println("Rudolph".matches(pattern));
        }

    }
}
