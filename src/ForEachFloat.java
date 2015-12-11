import java.util.Random;

/**
 * Created by ShiKun on 2015/12/11.
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        float[] f = new float[10];
        for(int i=0;i<10;i++) {
            f[i] = random.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
        for (char a : "AN AFRICA SWALLOW!".toCharArray()) {
            System.out.println(a + "\n");
        }
    }

}
