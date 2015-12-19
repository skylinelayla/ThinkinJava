import java.util.ArrayList;

/**
 * Created by ShiKun on 2015/12/18.
 */

public class AppleAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());

        }
        apples.add(new orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple) apples.get(i)).id();
        }
    }



}
class Apple{
    private static long counter;
    private final long id=counter++;

    public long id() {
        return id;
    }

}

class orange{

}


