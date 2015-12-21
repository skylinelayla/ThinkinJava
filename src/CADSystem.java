import java.awt.*;

import static net.mindview.util.Print.*;

/**清理类时的顺序
 * Created by ShiKun on 2015/12/21.
 */
public class CADSystem extends shapecad {
    private Circlecad c;
    private Trianglecad t;
    private Line[] items = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for(int j=0;j<items.length;j++) {
            items[j] = new Line(j, j * j);
        }
        c = new Circlecad(1);
        t = new Trianglecad(1);
        print("Combined constructor");

    }

    public void dispose() {//清理的顺序是相反的。先创建的后清理。后创建的先清理？？？
        print("CAD.dispose");
        t.dispose();
        c.dispose();
        for(int i=0;i<items.length;i++) {
            items[i].dispose();

        }
        super.dispose();

    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);

        try{

        }finally {
            x.dispose();

        }
    }
}
class shapecad{
    shapecad(int i) {
        print("Shape constructor");

    }

    void dispose() {
        print("Shape dispose");

    }
}

class Circlecad extends shapecad {
    Circlecad(int i) {
        super(i);
        print("Drawing Circle");

    }

    void dispose() {
        print("Erasing Circle");
        super.dispose();

    }
}

class Trianglecad extends shapecad {
    Trianglecad(int i) {
        super(i);
        print("Drawing Triangle");

    }

    void dispose() {
        print("Erasing Triangle");
        super.dispose();

    }
}

class Line extends shapecad {
    private int start,end;

    Line(int start, int end) {

        super(start);
        this.start=start;
        this.end = end;
        print("Drawing Line:" + start + " ," + end);
        //print("Drawing Line");

    }

    void dispose() {
        print("Erasing  Line:" + start + " ," + end);
        super.dispose();

    }
}

