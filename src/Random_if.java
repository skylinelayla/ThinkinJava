import java.util.Random;

/**
 * Created by ShiKun on 2015/12/11.
 */
public class Random_if {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[25];
        for(int i=0;i<25;i++) {
            num[i] = random.nextInt();
        }
        for(int j=0;j<24;j++) {
            if (num[j] < num[j + 1]) {
                System.out.println("小于");
            } else if (num[j] > num[j + 1]) {
                System.out.println("大于");
            } else if (num[j] == num[j + 1]) {
                System.out.println("相等");
            }
        }


    }
}
