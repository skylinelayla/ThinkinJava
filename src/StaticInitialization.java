import java.rmi.activation.ActivationSystem;
import static net.mindview.util.Print.*;
/**
 * Created by ShiKun on 2015/12/13.
 */
public class StaticInitialization {
}

class Bowl{
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    void f1( int marker){
        System.out.println("f1(" + marker + ")");
    }
    }

class Table{
    static Bowl bowl1 = new Bowl(1);

    Table() {

        System.out.println("Table()");
        bowl2.f1(1);

    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);

}
