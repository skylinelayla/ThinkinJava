package shape;

/**
 * Created by ShiKun on 2015/12/23.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        for (Shape shp : s) {
            shp.draw();//多态实现，各个类调用自己的方法，而不用实际生成自己的引用。相当于向上转型

        }
    }
}
