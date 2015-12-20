/**组合，只需将对象的引用置于新类中。
 * Created by ShiKun on 2015/12/16.
 */
public class SprinklerSystem {
    private String valve1,valve2,valve3,valve4;
    private Watersource source = new Watersource();//组合实现。即创建一个对象在此。
    private int i;
    private float f;

    public String toString() {
        return
                        "valve1="+valve1+" "+
                        "valve2="+valve2+" "+
                        "valve3="+valve3+" "+
                        "valve4="+valve4+"\n "+
                                "i="+i+" "+"f="+f+" "+
                                "source="+source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinkllers = new SprinklerSystem();
        System.out.print(sprinkllers);

    }
}

class Watersource{
    private String s;

    Watersource() {
        System.out.println("Watersource()");
        s = "constructed";
    }

    public String toString() {
        return s;
    }//该方法可以将对象转换成字符串，重写该方法。
}
