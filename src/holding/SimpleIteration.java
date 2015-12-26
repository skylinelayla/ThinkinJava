package holding;

import typeinfo.pets.*;

import java.util.*;
/**迭代器
 * Created by ShiKun on 2015/12/26.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> iterator = pets.iterator();//构造迭代器
        while (iterator.hasNext()) {//向后搜索
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");

        }
        System.out.println();

        for (Pet p : pets) {
            System.out.print(p.id() + ":" + p + " ");

        }
        System.out.println();
        iterator = pets.iterator();
        for(int i=0;i<6;i++) {
            iterator.next();
            iterator.remove();

        }
        System.out.println(pets);

    }

}
