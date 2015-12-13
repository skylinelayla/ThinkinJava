/**
 * Created by ShiKun on 2015/12/11.
 */
public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci.show(10);

    }

    public static void show(int n) {
        int[] array = new int[n];
        array[0]=1;
        array[1]=1;
        for(int i=2;i<n;i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for(int i=0;i<n;i++) {
            System.out.print(array[i] + " ");
        }

    }
}
