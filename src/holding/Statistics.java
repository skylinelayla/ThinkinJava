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
        Map<Integer, Integer> m = new HashMap<>();//创建hashMap
        for (int i=0;i<1000;i++) {//生成1000个20以内的随机数
            int r = random.nextInt(20);
            Integer freg = m.get(r);//统计出现的次数
            m.put(r, freg == null ? 1 : freg + 1);//放入m中

        }
        System.out.println(m);
    }
}
