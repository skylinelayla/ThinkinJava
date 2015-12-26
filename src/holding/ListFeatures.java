package holding;


import pets.*;
import shape.RandomShapeGenerator;

import typeinfo.pets.*;
import typeinfo.pets.Cymric;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;

import static net.mindview.util.Print.*;

import java.util.*;

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
        print("12:" + pets.containsAll(sub));//该方法是判断列表中是否有该子列表
        sub = Arrays.asList(pets.get(1), pets.get(4));//取元素加入sub中
        print("sub" + sub);
        List<Pet> copy = new ArrayList<>(pets);
        copy.retainAll(sub);//取交集操作
        print("13:" + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        print("14:" + copy);
        copy.removeAll(sub);
        print("15" + copy);
        copy.set(1, new Mouse());
        print("16:" + copy);
        copy.addAll(2, sub);//对集合插入
        print("17:" + copy);
        print("18:" + pets.isEmpty());
        pets.clear();
        print("19:" + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("20:" + pets);
        Object[] obj = pets.toArray();//将对象转换成数组，
        print("22:" + obj[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23:" + pa[3].id());
    }
}
