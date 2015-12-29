package strings;

import java.util.Random;

/**使用Stringbuilder类来做字符串操作
 * Created by ShiKun on 2015/12/29.
 */
public class UseStringbuilder {
    public static Random random = new Random(47);
    public String toString(){
        StringBuilder results = new StringBuilder("[");
        for(int i=0;i<25;i++) {
            results.append(random.nextInt(100));
            results.append(",");
        }
        results.delete(results.length() - 2, results.length());
        results.append("]");
        return results.toString();
    }

    public static void main(String[] args) {
        UseStringbuilder usb = new UseStringbuilder();
        System.out.print(usb);

    }
}
