import java.util.Random;

/**
 * Created by ShiKun on 2015/12/17.
 */
public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id=id;
    }

    private final int valueOne=9;
    private static final int VALUE_TWO=99;
    public static final int VALUE_THREE=39;
    private final int i4 = random.nextInt(20);
    static final int INT_5=random.nextInt(20);



}

class ValueData{
    int i;

    public ValueData(int i) {
        this.i=i;
    }
}