package holding;

import java.util.*;
/**队列的实现
 * Created by ShiKun on 2015/12/28.
 */
public class QueueDemo {

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {//peek和element都是返回队头
            System.out.print(queue.remove() + " ");//poll和remove方法移除并且返回队头

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for(int i=0;i<10;i++) {
            queue.offer(random.nextInt(i + 10));//将元素插入到队尾

        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {

            qc.offer(c);
        }

        printQ(qc);
    }


}
