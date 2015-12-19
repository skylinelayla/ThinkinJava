/**
 * Created by ShiKun on 2015/12/13.
 */
public class PassingThis {

    public static void main(String[] args) {
        new Person().eat(new Apple1());

    }
}
class Person{
    public void eat(Apple1 apple) {
        Apple1 peeled = apple.getPeeled();

        System.out.println("YUMMY");
    }
}

class Peeler{
    static Apple1 peel(Apple1 apple) {
        return apple;
    }
}
class Apple1{
    Apple1 getPeeled() {
        return Peeler.peel(this);
    }
}