import java.util.Random;

import static net.mindview.util.Print.*;
/**定义为static表示只有一份，定义为final表示是常量。
 * final声明的值不可以被改变
 * 还可以在参数列表中将参数声明称final。这就意味着不能改变参数。即不能对参数进行改变
 * 但传进的参数本来就是不可以改变的吧。。，
 * final的方法。即不可改变的方法，类似于private
 * final类。即不能继承该类，不可改变该类。
 * Created by ShiKun on 2015/12/17.
 */
public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id=id;
    }

    private final int valueOne=9;
    private static final int VALUE_TWO=99;
    public static final int VALUE_THREE=39;
    private final int i4 = random.nextInt(20);
    static final int INT_5=random.nextInt(20);
    private ValueData v1 = new ValueData(11);
    private final ValueData v2 = new ValueData(22);
    private static final ValueData VAL_3 = new ValueData(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id+":"+"i4="+i4+", INT_5="+INT_5;

    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //fd1.valueOne++;不能更改
        fd1.v2.i++;
        fd1.v1 = new ValueData(9);
        for(int i=0;i<fd1.a.length;i++) {
            fd1.a[i]++;
        }

        print(fd1);
        print("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);

    }



}

class ValueData{
    int i;

    public ValueData(int i) {
        this.i=i;
    }
}