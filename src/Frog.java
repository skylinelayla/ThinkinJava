/**向上转型
 * Created by ShiKun on 2015/12/17.
 */
public class Frog extends Amphibian {
    public void set(Frog ax) {
        System.out.print("hi");

    }
    public static void main(String[] args) {
        Frog fg = new Frog();
        fg.set(fg);

    }
}
class Amphibian{
    public void set(Amphibian ax) {
        System.out.println("hi");
    }
}
