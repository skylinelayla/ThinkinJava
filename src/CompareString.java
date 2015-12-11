import java.util.Scanner;

/**
 * Created by ShiKun on 2015/12/10.
 */
public class CompareString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = input.nextLine();
        System.out.println("Enter a String");

        String s2 = input.nextLine();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
