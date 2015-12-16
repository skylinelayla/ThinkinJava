/**
 * Created by ShiKun on 2015/12/16.
 */
public class SprinklerSystem {
    private String valve1,valve2,valve3,valve4;
    private Watersource source = new Watersource();
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
    }
}
