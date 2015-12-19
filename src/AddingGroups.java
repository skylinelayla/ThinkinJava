import java.util.*;

/**在一个Collection中添加一组元素。
 * Created by ShiKun on 2015/12/18.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));//接受一个数组或者用逗号分隔的元素列表，并将其转换为List对象
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));//接受一个Collection对象，以及一个数组或者是用一个由逗号分隔的列表，并添加到Collection中
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 10);
        list.set(1, 99);
       // list.add(12);不能改变list的长度。

    }

}
