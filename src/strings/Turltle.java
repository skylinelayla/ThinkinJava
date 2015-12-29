package strings;

import java.io.PrintStream;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.SynchronousQueue;

/**Formatter类的使用，格式化翻译器
 * Created by ShiKun on 2015/12/29.
 */
public class Turltle {
    private String name;
    private Formatter f;

    public Turltle(String name, Formatter f) {
        this.name=name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n ", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlies = System.out;
        Turltle tommy = new Turltle("Tommy", new Formatter(System.out));//构造Formatter时必须要指定输出到哪里
        Turltle terry = new Turltle("Terry", new Formatter(outAlies));
        tommy.move(0, 0);
        terry.move(4,8);

    }

}
