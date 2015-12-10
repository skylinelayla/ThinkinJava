import com.sun.xml.internal.ws.api.ha.StickyFeature;
import static net.mindview.util.Print.*;
/**操作符自增自减 ++a代表先计算再产生值，a++代表先产生值再计算
 *
 * Created by ShiKun on 2015/12/10.
 */
public class AutoInc {
    public static void main(String[] args) {
        int i=1;
        print("i: " + i);//1
        print("++i: " + (++i));//2
        print("i++: " + (i++));//2->3
        print("i: " + i);//3



    }
}
