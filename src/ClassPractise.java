/**方法的重载
 * Created by ShiKun on 2015/12/13.
 */
public class ClassPractise {

    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.Bark("ss");
        dog1.Bark(5);
    }
}

class Dog1{

    public void Bark(String bark) {

        System.out.println("bark!");
    }

    public void Bark(int bark) {
        System.out.println("howling");

    }

        }
