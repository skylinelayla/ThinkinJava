import java.nio.file.attribute.UserPrincipalNotFoundException;

import static net.mindview.util.Print.*;
/**
 * protected关键字，对类的用户来说是private的，对子类来说是public的
 * Created by ShiKun on 2015/12/22.
 */
public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc" + orcNumber + ":" + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limbuger", 12);
        print(orc);
        orc.change("Bob", 12);
        print(orc);

    }
}

class Villain{
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;

    }

    public String toString() {
        return "I'm a Villain and my name is" + name;
    }
}
