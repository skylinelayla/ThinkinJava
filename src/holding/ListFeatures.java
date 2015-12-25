package holding;


import shape.RandomShapeGenerator;

import typeinfo.pets.*;
import static net.mindview.util.Print.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**List类的使用
 * Created by ShiKun on 2015/12/25.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1:" + pets);
        Hamster h = new Hamster();
        pets.add(h);//增加操作
        print("2:" + pets);
        print("3:" + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        print("4:" + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5:" + pets.indexOf(cymric));//并没有cymric了，所以查询和删除操作都是无效的
        print("6:" + pets.remove(cymric));
        print("7:" + pets.remove(p));
        print("8:" + pets);
        pets.add(3, new Mouse());//带idx的增加
        print("9:" + pets);
        List<Pet> sub = pets.subList(1, 4);//截断操作，选取1到4之间的元素1,2,3,
        print("subList" + sub);
        print("10:" + pets.containsAll(sub));
        Collections.sort(sub);//排序
        print("sorted sublist" + sub);
        print("11:" + pets.containsAll(sub));
        Collections.shuffle(sub, random);//乱序
        print("shuffle subList:" + sub);


    }
}
