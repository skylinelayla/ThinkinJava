package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**ListIteration 可以访问当前位置前一个和后一个的元素索引
 * Created by ShiKun on 2015/12/26.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "," + it.nextIndex() + "," + it.previousIndex()+":");
//节点的前驱后继访问
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.print(it.previous().id() + " ");

        }
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());//元素的设置，具有set方法

        }
        System.out.println(pets);
    }
}
