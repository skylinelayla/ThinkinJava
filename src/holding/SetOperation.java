package holding;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.*;

/**集合的包含操作，
 * Created by ShiKun on 2015/12/27.
 */
public class SetOperation {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));

        set1.add("M");
        print("H:" + set1.contains("H"));
        print("N:" + set1.contains("N"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "A B C D".split(" "));
        set1.removeAll(set2);//删除操作

        print(set1);

    }

}
