import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ShiKun on 2015/12/20.
 */
public class Shapes {
    public static void main(String[] args) {
        List<Shapeme> shapelist = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shapeme shpe : shapelist) {
            shpe.draw();
            
        }
    }
}
abstract class Shapeme{
    void draw() {
        System.out.println(this + ".draw()");

    }

    abstract public String toString();
}

class Circle extends Shapeme {
    public String toString() {
        return "Circle";
    }//必须要实现抽象类的抽象方法

}

class Square extends Shapeme{
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shapeme{
    public String toString() {
        return "Triangle";
    }
}