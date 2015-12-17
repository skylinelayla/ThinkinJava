import static net.mindview.util.Print.*;
/**
 * Created by ShiKun on 2015/12/17.
 */
public class Detergent extends Cleanser {
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();//调用基类的方法超类方法

    }

    public void foam() {
        append("foam()");

    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.foam();
        x.foam();
        print(x);
        print("Testing base class");
        Cleanser.main(args);

    }
}

class Cleanser{
    private String s = "Cleanser";

    public void append(String a) {
        s+=a;
    }

    public void dilute() {
        append("dilute()");

    }

    public void apply() {
        append("apply()");

    }

    public void scrub() {
        append("scrub()");

    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.scrub();
        print(x);

    }
}

class newDetergent extends Detergent{
    public void scrub() {
        append("new Detergent");

    }

    public void sterilize() {
        append("I am new!");

    }


}