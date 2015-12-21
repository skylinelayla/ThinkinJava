import static net.mindview.util.Print.*;

/**基类构造器的初始化顺序基类构造器总是会被调用，并在子类构造器被调用之前。
 * Created by ShiKun on 2015/12/21.
 */
public class Cartoon extends Drawing {
    public Cartoon() {
        print("Cartoon constructor");

    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}

class Art{
    Art() {
        print("Art Constructor");

    }
}

class Drawing extends Art{
    Drawing() {
        print("Drawing constructor");

    }
}

