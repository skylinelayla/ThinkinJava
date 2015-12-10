import java.util.Random;

/**练习7 模拟扔硬币
 * Created by ShiKun on 2015/12/10.
 */
public class Coin {
    public static void main(String[] args) {
        Random random = new Random();
        int coin = random.nextInt();

        if (coin % 2 == 0) {
            System.out.println("positive");
        }else{
            System.out.println("negetive");
        }
    }
}
