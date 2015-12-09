/**练习8 创建一个类很多对象，但其static域的只有一个实例
 * Created by ShiKun on 2015/12/9.
 */
class Demo2_2 {
    static int num=5;

    public static void main(String[] args) {

        Demo2_2 test1=new Demo2_2();
        Demo2_2 test2=new Demo2_2();
        Demo2_2 test3=new Demo2_2();

        System.out.println(test1.num);
        System.out.println(test2.num);
        System.out.println(test3.num);

    }
}
