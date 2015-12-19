import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**示例用Integer对象填充了一个collection，然后打印出来
 * Created by ShiKun on 2015/12/19.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for(int i=0;i<10;i++) {
            c.add(i);
        }

        for (Integer i : c) {
            System.out.println(i + ",");
        }

      //  Collection<Integer> d = new Set<Integer>();

    }
}
