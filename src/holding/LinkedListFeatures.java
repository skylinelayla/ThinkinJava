package holding;

import net.mindview.util.Print;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import static net.mindview.util.Print.*;
import java.util.LinkedList;

/**LinkedList 的实现
 * Created by ShiKun on 2015/12/26.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);
        print(pets.getFirst());
        print(pets.element());//取得第一个元素

        print(pets.remove());//删除第一个元素
        print(pets.removeFirst());

        print(pets.getLast());

        print(pets);

        print(pets.poll());//弹出第一个元素
        pets.addFirst(new Rat());
        print(pets);

    }
}
