package generics;

/**泛型的使用
 * Created by ShiKun on 2015/12/31.
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a=a;
    }

    public void set(T a) {
        this.a=a;

    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Integer a=10;
        Holder3<Integer> h3 = new Holder3<>(a);

        h3.get();

    }
}
