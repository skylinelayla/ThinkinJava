/**JAVA SE5 新特性 可变的类参数
 * Created by ShiKun on 2015/12/13.
 */

public class NewVarArgs {

    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(41), new Float(44.5), new Double(44.4));

    }



}






