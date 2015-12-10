import java.util.jar.JarEntry;

/**练习10 比较位运算，两个
 * Created by ShiKun on 2015/12/10.
 */
public class BinaryPractise {
    public static void main(String[] args) {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        System.out.println("i=" + Integer.toBinaryString(i));
        System.out.println("j=" + Integer.toBinaryString(j));

        System.out.println("i&j=" + Integer.toBinaryString(i & j));
        System.out.println("i|j=" + Integer.toBinaryString(i | j));
        System.out.println("i^j=" + Integer.toBinaryString(i ^ j));
    }
}
