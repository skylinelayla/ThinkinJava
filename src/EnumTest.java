/**
 * Created by ShiKun on 2015/12/13.
 */
public class EnumTest {
    public enum money{
       ONE,FIVE,TEN,TWEENTIE
    };

   public static money m1;
    public static void describe(money m2) {
        switch (m2) {
            case ONE:
                System.out.println("一块钱");break;
            case FIVE:
                System.out.println("五块钱");break;
            case TWEENTIE:
                System.out.println("二十");break;
        }

    }
    public static void main(String[] args) {
        for(money m1:money.values()){
            System.out.println(m1 + " ");
            EnumTest.describe(m1);

        }
    }

}
