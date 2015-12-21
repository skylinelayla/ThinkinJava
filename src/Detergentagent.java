import static net.mindview.util.Print.*;
/**Detergent 的代理实现
 * Created by ShiKun on 2015/12/21.
 */
public class Detergentagent {
    private String s = "Cleanser";
    private Cleanser cleanser = new Cleanser();

    public void dilute() {
        cleanser.append("dilute()");

    }


    public static void main(String[] args) {
        Detergentagent detergentagent = new Detergentagent();


       System.out.print(detergentagent);

    }
}
