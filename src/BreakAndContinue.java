import static net.mindview.util.Range.*;
/**
 * Created by ShiKun on 2015/12/11.
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }

        System.out.println();

        for (int i : range(100)) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }

        int i=0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
