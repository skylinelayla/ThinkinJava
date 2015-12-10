/**练习5+练习6
 * Created by ShiKun on 2015/12/10.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name="scruffy";
        dog2.says = "Wurf!";

        Dog dog3 = new Dog();
        dog3=dog1;
        System.out.println(dog3 == dog1);
        System.out.println(dog1.equals(dog3));



    }
}
