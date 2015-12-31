package generics;

/**
 * Created by ShiKun on 2015/12/31.
 */
class Amphibian{}
class Vechicle{}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> h() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);

    }

    static FourTuple<Vechicle, Amphibian, String, Integer> k() {
        return new FourTuple<>(new Vechicle(), new Amphibian(), "hi", 47);

    }
    static FiveTuple<Vechicle, Amphibian, String, Integer,Double> l() {
        return new FiveTuple<>(new Vechicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        //ttsi.first = "there";
        System.out.println(ttsi);
        System.out.println(f());
        System.out.println(k());
        System.out.println(l());
    }
}
