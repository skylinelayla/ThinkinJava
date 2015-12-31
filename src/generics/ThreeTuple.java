package generics;

/**
 * Created by ShiKun on 2015/12/31.
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third=c;
    }

    public String toString() {
        return "(" + first + "," + second + "," + third + ")";

    }
}
