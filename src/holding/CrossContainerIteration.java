package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by ShiKun on 2015/12/26.
 */
public class CrossContainerIteration {
    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTH = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTH.iterator());

    }

    public static void display(Iterator<Pet> it){
        while (it.hasNext()) {
            Pet pet = it.next();
            System.out.print(pet.id() + ":" + pet + " ");

        }
        System.out.println();
    }
}
