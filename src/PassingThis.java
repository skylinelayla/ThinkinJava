/**
 * Created by ShiKun on 2015/12/13.
 */
public class PassingThis {

    public static void main(String[] args) {
        new Person().eat(new Apple());

    }
}
class Person{
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();

        System.out.println("YUMMY");
    }
}

class Peeler{
    static Apple peel(Apple apple) {
        return apple;
    }
}
class Apple{
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}