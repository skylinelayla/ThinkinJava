import java.nio.file.WatchEvent;
import java.util.UnknownFormatConversionException;

import static net.mindview.util.Print.*;

/**构造类的初始化调用
 * Created by ShiKun on 2015/12/21.
 */
public class PlaceSetting extends Custom {
    private Spoon sp;//代理
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;


    public PlaceSetting(int i) {
        super(i+1);
        sp = new Spoon(i + 2);
        fork = new Fork(i + 2);
        knife = new Knife(i + 2);
        dinnerPlate = new DinnerPlate(i + 2);
        print("PlaceSetting constructor");

    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }

}
class Plate{
    Plate(int i) {
        print("Plate Constructor");

    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        print("DinnerPlate Constructor");

    }
}

class Utensil {
    Utensil(int i) {
        print("Utensil constructor");

    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        print("Spoon constructor");

    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        print("Fork construcor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        print("Knife constructor");

    }
}

class Custom{
    Custom(int i) {
        print("Custom constructor");

    }
}