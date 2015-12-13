/**类的构造器
 * Created by ShiKun on 2015/12/12.
 */
public class Rock {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            new Simpleconstruct();
            new Rock2(5);

        }
    }
}
class Simpleconstruct{
    Simpleconstruct() {
        System.out.println("Rock");
    }
}
class Rock2{
    Rock2(int i) {
        System.out.println("Rock" + i + " ");

    }
}