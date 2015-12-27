package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**Map的使用,统计随机数出现的次数
 * Created by ShiKun on 2015/12/27.
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i=0;i<1000;i++) {
            int r = random.nextInt(20);
            Integer freg = m.get(r);
            m.put(r, freg == null ? 1 : freg + 1);

        }
        System.out.println(m);
    }
}
