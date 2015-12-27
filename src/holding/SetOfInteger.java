package holding;

import java.util.*;

/**set不能保存重复的元素
 * Created by ShiKun on 2015/12/27.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intset = new LinkedHashSet<>();//散列的方式HashSet 和 TreeSet LinkedHashSet

        for(int i=0;i<10000;i++) {
            intset.add(random.nextInt(30));

        }
        System.out.println(intset);

    }
}
