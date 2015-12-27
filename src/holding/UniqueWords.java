package holding;

import net.mindview.util.*;

import java.util.HashSet;
import java.util.Set;

/**读入文件然后创建set
 * Created by ShiKun on 2015/12/27.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(new TextFile("src/holding/SetOperation.java", "\\W+"));//注意路径
        System.out.println(words);


    }
}
