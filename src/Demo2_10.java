import java.sql.Struct;
import java.util.Scanner;

/**
 * Created by ShiKun on 2015/12/9.
 */
public class Demo2_10 {
    public static void main(String[] args) {
        String[] s = new String[3];
        for(int i=0;i<3;i++) {
            System.out.println("请输入");
            Scanner input = new Scanner(System.in);
            s[i]= input.nextLine();
        }


        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);

    }
}
