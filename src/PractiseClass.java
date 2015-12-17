/**创建基类，非默认构造器。创建子类，具有默认构造器和非默认构造器
 * Created by ShiKun on 2015/12/17.
 */
public class PractiseClass extends Test {

    PractiseClass(int i) {
        super(i);

        System.out.println("constructor");
    }

    PractiseClass() {
        super(11);
        System.out.println(11);
    }

}
class Test{

    Test(int i) {
        System.out.println("Test Constructor");

    }

}
