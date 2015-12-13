/**返回当前对像的方法
 * Created by ShiKun on 2015/12/13.
 */
public class Leaf {
    int i=0;

    Leaf increment() {
        this.i++;
        return this;
    }

    void print() {
        System.out.println("i=" + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();

    }
}
