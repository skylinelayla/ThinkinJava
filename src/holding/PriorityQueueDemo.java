package holding;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

/**优先队列的操作
 * Created by ShiKun on 2015/12/28.
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for(int i=0;i<10;i++) {
            priorityQueue.offer(random.nextInt(i + 10));

        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 28, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);//最小的值拥有更高的优先级
        QueueDemo.printQ(priorityQueue);
        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));

        PriorityQueue<String> strings1 = new PriorityQueue<>(strings);
        QueueDemo.printQ(strings1);//排序


    }
}
