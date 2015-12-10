/**equals()默认行为是比较引用。
 * Created by ShiKun on 2015/12/10.
 */
public class EqualMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i=v2.i=100;
        System.out.println(v1.equals(v2));

    }
}

class Value{
    int i;
}
