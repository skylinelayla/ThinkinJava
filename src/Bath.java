import static net.mindview.util.Print.*;
/**组合复用+输出toString的方法使用
 * Created by ShiKun on 2015/12/20.
 */
public class Bath {
    private String s1 = "Happy",s2="Happy",s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        print("Inside Bath()");
        s3 = "Joy";
        toy=3.14f;
        castille = new Soap();
    }
    {
        i = 47;}

    public String toString() {
        if (s4 == null) {
            s4 = "Joy";
        }
        return "s1=" + s1 + "\n" +
                "s2=" + s2 + "\n" +
                "s3=" + s3 + "\n" +
                "s4=" + s4 + "\n" +
                "i=" + i + "\n"+
                "toy="+toy+"\n"+
                "castille="+castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}
class Soap{
    private String s;

    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
