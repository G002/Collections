package Collections;

import Spring.Ingredient;

import java.util.ArrayList;

/**
 * Created by geethakalluri on 8/23/16.
 */
public class ArrayListToArray {
    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("contents of Al" + al);

        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        for (int i: ia) sum += i;
        System.out.println("Sum is "+ sum);


    }

}
