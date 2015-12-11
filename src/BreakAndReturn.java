/**
 * Created by ShiKun on 2015/12/11.
 */
public class BreakAndReturn {
    public static void main(String[] args) {
        for(int i=1;i<120;i++) {
            if (i == 100) {
                break;
            }
            System.out.print(i + " ");
        }

        for(int i=1;i<120;i++) {
            if (i == 100) {
                return ;
            }
            System.out.print(i + " ");
        }



    }


}
