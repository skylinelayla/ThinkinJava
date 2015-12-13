/**可变参数列表
 *
 * Created by ShiKun on 2015/12/13.
 */
public class VarArgs {
    static void printArray(Object[] args) {
        for (Object ob : args) {
            System.out.println(ob + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}

class A{

}
