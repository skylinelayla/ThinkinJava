package typeinfo1;

import java.util.Random;

/**类的初始化
 * Created by ShiKun on 2015/12/31.
 */
public class Initialization {
    public static Random random = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}

class Initable{
    static final int staticFinal=47;
    static final int staticFinal2 = Initialization.random.nextInt(1000);

}
class Initable2{
    static int staticNonFinal=147;
    static{
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal=74;
    static {
        System.out.println("Initializing Initable3");

    }
}